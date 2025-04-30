package com.jad.milk;

public sealed abstract class MilkPropertyHandler
        permits MilkPropertyHandler.ExpirationDateHandler {
    private final CanHandleExecutor canHandle;
    private final ProcessExecutor process;
    private MilkPropertyHandler nextHandler = null;

    protected MilkPropertyHandler(final CanHandleExecutor canHandle,
                                  final ProcessExecutor process) {
        this.canHandle = canHandle;
        this.process = process;
    }

    public boolean handle(MilkBottle milkBottle, String criteriaText) {
        Criteria criteria = new Criteria(criteriaText.split("=")[0],
                                         criteriaText.split("=")[1]);
        return (this.canHandle(milkBottle, criteria))
                ? this.process(milkBottle, criteria)
                : this.nextHandler.handle(milkBottle, criteriaText);
    }

    private boolean canHandle(MilkBottle milkBottle, Criteria criteria) {
        return this.canHandle.execute(milkBottle, criteria);
    }

    private boolean process(MilkBottle milkBottle, Criteria criteria) {
        return this.process.execute(milkBottle, criteria);
    }

    @FunctionalInterface
    private interface CanHandleExecutor {
        boolean execute(MilkBottle milkBottle, Criteria criteria);
    }

    @FunctionalInterface
    private interface ProcessExecutor {
        boolean execute(MilkBottle milkBottle, Criteria criteria);
    }

    private final class ExpirationDateHandler extends MilkPropertyHandler {
        private ExpirationDateHandler() {
            super((milkBottle, criteria) -> criteria.key().equals("date"),
                  (milkBottle, criteria) -> criteria.value().equals(milkBottle.getExpirationDate()));
        }
    }
}
