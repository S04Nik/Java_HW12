package com.example.HW12.model;

public class User {
    public String name;
    public  String phone;
    public String age;
    public String email;
    public String  gender;
    public  boolean subscr;
    public User(){}
    public User(String n,String ph,String age, String email,String gender ,boolean subscr){
        this.name=n;
        this.age=age;
        this.phone=ph;
        this.email=email;
        this.gender=gender;
        this.subscr=subscr;
    }
}
