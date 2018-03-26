package com.example.shejimoshi.shejimoshi.builder;

/**
 * Created by beixinyuan_android on 2018/3/26.
 */

public class BuilderA {

    private String name;

    private int age;

    public BuilderA setName(String name) {
        this.name = name;
        return this;
    }

    public BuilderA setAge(int age) {
        this.age = age;
        return this;
    }
}
