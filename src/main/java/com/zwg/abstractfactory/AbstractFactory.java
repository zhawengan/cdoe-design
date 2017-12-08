package com.zwg.abstractfactory;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
public interface AbstractFactory {
    public Engine createEngine();
    public Aircondition createAircondition();
}
