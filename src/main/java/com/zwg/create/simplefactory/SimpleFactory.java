package com.zwg.create.simplefactory;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
public class SimpleFactory {
    public static Product factory(String product) {
        if (product.equals("Washer")) {
            return new Washer();
        } else if (product.equals("Icebox")) {
            return new Icebox();
        } else if (product.equals("AirCondition")) {
            return new AirCondition();
        } else {
            return null;
        }

    }
}
