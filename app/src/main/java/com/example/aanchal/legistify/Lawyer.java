package com.example.aanchal.legistify;

/**
 * Created by aanchal on 6/10/15.
 */
public class Lawyer {
    String name;
    String field;
    String contactNumber;
    String address;
    String city;
    String state;

    public Lawyer(){

    }

    public Lawyer(String name, String field, String contactNumber,String address, String city, String state){
        this.name=name;
        this.field=field;
        this.contactNumber=contactNumber;
        this.address=address;
        this.city=city;
        this.state=state;
    }
}
