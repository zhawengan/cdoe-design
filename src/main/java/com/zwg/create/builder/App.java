package com.zwg.create.builder;

/**
 * Created by zwg.BlueOcean on 2017/12/14.
 * 建造者模式
 */
public class App {
    public static void main(String[] args) {
        PersonBuilder pb=new ManBuilder();
        Director director=new Director();
        Person person=director.constructPerson(pb);
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());

    }
}
