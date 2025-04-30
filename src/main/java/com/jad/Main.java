package com.jad;

import com.jad.milk.Country;
import com.jad.milk.Flavor;
import com.jad.milk.MilkBottle;
import com.jad.milk.MilkType;

public class Main {
    public static void main(String[] args) {
        MilkBottle myMilk = new MilkBottle(
                "2025-12-31",
                1,
                Country.FRANCE,
                "Envia",
                MilkType.COW,
                true,
                false,
                0.5,
                Flavor.ORIGINAL);

        System.out.println(myMilk.is("date=2025-12-31",
                                     "Vol=1",
                                     "FRANCE",
                                     "Brand=Envia"));
    }
}