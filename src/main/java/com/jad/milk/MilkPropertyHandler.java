package com.jad.milk;

public abstract class MilkPropertyHandler {
    private MilkPropertyHandler nextHandler;

    public MilkPropertyHandler(MilkPropertyHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public boolean handle(MilkBottle milkBottle) {
        if (this.canHandle(milkBottle)) {
            return this.process(milkBottle);
        } else if (this.nextHandler != null) {
            return this.nextHandler.handle(milkBottle);
        }
    }

    protected abstract boolean canHandle(MilkBottle milkBottle);

    protected abstract boolean process(MilkBottle milkBottle);
}
