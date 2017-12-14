package com.zwg.create.singleton;

/**
 * Created by zwg.BlueOcean on 2017/12/14.
 */
public class Singleton {
    public static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }

        }
        return instance;
    }

}
