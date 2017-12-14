package com.zwg.create.singleton;

/**
 * Created by zwg.BlueOcean on 2017/12/14.
 * 单例模式
 */
public class App {
    public static void main(String[] args){
        Singleton singleton=Singleton.getInstance();
        if(singleton!=null){
            System.out.println("创建对象成功");
        }
    }

}
