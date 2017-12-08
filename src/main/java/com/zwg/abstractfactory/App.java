package com.zwg.abstractfactory;

/**
 * Created by zwg.BlueOcean on 2017/12/8.
 */
/*
* 抽象工厂和工厂方法的主要区别在于维度上，抽象工厂的继承实例可以生成一系列的完整的产品
* 此外，由于反射机制的引入，在抽象工厂的基础上，我通过对传入的参数进行反射，生成指定的工厂对象。
* 如此，对于产品和工厂的扩展只要实现添加就行了，无需修改。
* 而对于客户端来说，产品和工厂的创建无需指定具体的对象，通过传参就可以获取到对应的对象，实现了真正的代码解耦
 */
public class App {
    public static void  main(String[] args){
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        factoryBMW320.createEngine();
        factoryBMW320.createAircondition();


        FactoryBMW523 factoryBMW523 = new FactoryBMW523();
        factoryBMW523.createEngine();
        factoryBMW523.createAircondition();
    }
}
