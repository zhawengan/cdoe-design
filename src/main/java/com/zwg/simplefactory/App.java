package com.zwg.simplefactory;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
/*
*1、定义产品Product
*2、由产品Product派生出了一系列的实际产品，如：Washer,Icebox,AirCondition
*3、定义简单工厂SimpleFactory类，SimpleFactory的特点是根据传入参数返回动态产品。
*   但限制很明显，它会根据内部逻辑返回对应对象。如果要实现扩展，必须重新修改内部逻辑。
*   比如又有了新的产品（Computer）产生，已有的逻辑就无法满足需求了
 */
public class App {
    public static void main(String[] args){
        SimpleFactory.factory("Washer");
        SimpleFactory.factory("Icebox");
        SimpleFactory.factory("AirCondition");
    }
}
