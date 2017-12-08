package com.zwg.abstractfactory;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
public class FactoryBMW320 implements  AbstractFactory{
    public Engine createEngine() {
        return new EngineA();
    }

    public Aircondition createAircondition() {
        return new AirconditionA();
    }
}
