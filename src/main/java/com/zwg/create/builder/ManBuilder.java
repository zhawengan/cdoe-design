package com.zwg.create.builder;

/**
 * Created by zwg.BlueOcean on 2017/12/14.
 */
public class ManBuilder implements PersonBuilder{
    Person person;
    public ManBuilder(){
        person=new Person();
    }
    public void buildHead() {
        person.setHead("build man head");
    }

    public void buildBody() {
        person.setBody("build man body");
    }

    public void buildFoot() {
        person.setFoot("build man foot");
    }

    public Person buildPerson() {
        return person;
    }
}
