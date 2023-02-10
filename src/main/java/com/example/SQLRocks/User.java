package com.example.SQLRocks;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //it tell to spring,here you have to create table(Database)
@Table(name="User_Information")  //This annotation giving the table name.
public class User {

    @Id // it written on that attribute which has to become a primary key.
    private int id; //this is the primary key
    private String name;
    private int age;
    private String mobileNo;

    //now i need to create constructor.this is good practice to create both default and parameterized constructor.
    public User() {
    }

    public User(int id, String name, int age,String mobileNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNo=mobileNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
