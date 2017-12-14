package com.zwg.create.abstractfactory;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
public class FactoryBMW523 implements AbstractFactory {
    public Engine createEngine() {
        return new EngineB();
    }

    public Aircondition createAircondition() {
        return new AirconditionB();
    }
}
