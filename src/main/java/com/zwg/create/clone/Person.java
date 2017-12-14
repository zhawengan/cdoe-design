package com.zwg.create.clone;

/**
 * Created by zwg.BlueOcean on 2017/12/14.
 */
public class Person implements Cloneable{
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public Person() {
    }

    public Address getAddress() {
        return address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person=(Person)super.clone();
        person.address=(Address) address.clone();
        return person;
    }


}
