package com.zwg.create.clone;

/**
 * Created by zwg.BlueOcean on 2017/12/14.
 */
public class Address implements Cloneable{
    private String province;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    private String city;
    private String street;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
