package com.example.simeunbo.myapplication;

public class Student {
    private String name;
    private String stdnum;

    public Student(String name, String stdnum) {
        this.name = name;
        this.stdnum = stdnum;
    }

    public String getName() {
        return name;
    }

    public String getStdnum() {
        return stdnum;
    }
}