package com.AkhandBharat.jpademo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //
@Table(name="yogesh_table")
public class User {
    @Id // this annotation is used to show this attributes as primary key
    @Column(name="id") //if you don't write this then column name would be rollNo
    int rollNo;
    String name;
    int age;
    String mobileNo;

    public User(){}
    public User(int rollNo, String name, int age, String mobileNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.mobileNo = mobileNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
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

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
