package com.zwg.factorymethod;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
public class IceboxFactory implements Factory{
    public Product create() {
        return new Icebox();
    }
}
