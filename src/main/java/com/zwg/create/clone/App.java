package com.zwg.create.clone;

/**
 * Created by zwg.BlueOcean on 2017/12/14.
 * 克隆模式
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address=new Address();
        address.setProvince("北京");
        address.setCity("北京");
        address.setStreet("海淀");
        Person person=new Person();
        person.setAddress(address);
        person.setName("zwg");
        person.setAge("30");

        Person person1=(Person) person.clone();
        person1.getAddress().setStreet("顺义");
        person1.setName("zha");

        System.out.println(String.format("Name:%s,Age:%s,Address.Province:%s,Address.City:%s,Address.Street:%s",
                person.getName(),
                person.getAge(),
                person.getAddress().getProvince(),
                person.getAddress().getCity(),
                person.getAddress().getStreet()));

        System.out.println(String.format("Name:%s,Age:%s,Address.Province:%s,Address.City:%s,Address.Street:%s",
                person1.getName(),
                person1.getAge(),
                person1.getAddress().getProvince(),
                person1.getAddress().getCity(),
                person1.getAddress().getStreet()));

    }
}
