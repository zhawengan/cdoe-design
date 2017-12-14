package com.zwg.create.builder;

/**
 * Created by zwg.BlueOcean on 2017/12/14.
 */
public class Director {
    public Person constructPerson(PersonBuilder pb){
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return  pb.buildPerson();
    }
}
