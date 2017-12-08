package com.zwg.factorymethod;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
/*
*1、定义产品Product
*2、由产品Product派生出了一系列的实际产品，如：Washer,Icebox,AirCondition
*3、定义了抽象Factory
*4、由抽象Factory派生出AirConditionFactory，WasherFactory，IceboxFactory
*   每个工厂负责生产自己的产品，当有新产品出现时，只要添加新的Factory派生类就行了。
*   代码的耦合推移到了client端
*   但工厂方法模式缺点也非常明显，当产品比较多，或者分支比较多时，需要产生大量的Factory子类，
*   其维护代价和使用代价都很大。
 */
public class App {
    public static void main(String[] args){
        Product p1= new AirConditionFactory().create();
        Product p2= new WasherFactory().create();
        Product p3= new IceboxFactory().create();
    }
}
