package com.zwg.create.factorymethod;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
public class WasherFactory implements Factory{
    public Product create() {
        return new Washer();
    }
}
