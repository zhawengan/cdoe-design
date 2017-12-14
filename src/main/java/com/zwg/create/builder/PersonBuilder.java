package com.zwg.create.builder;

/**
 * Created by zwg.BlueOcean on 2017/12/14.
 */
public interface PersonBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
