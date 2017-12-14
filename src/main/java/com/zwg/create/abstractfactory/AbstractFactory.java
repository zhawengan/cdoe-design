package com.zwg.create.abstractfactory;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
public interface AbstractFactory {
    public Engine createEngine();
    public Aircondition createAircondition();
}
