package com.example.shejimoshi.shejimoshi.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beixinyuan_android on 2018/3/26.
 */

public class PersonB implements Cloneable{

    private String name;

    private int age;

    private ArrayList<String> hobbies;

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

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Object clone() {
        PersonB person = null;
        try {
            person = (PersonB) super.clone();
            person.name = this.name;
            person.age = this.age;
            person.hobbies = (ArrayList<String>)this.hobbies.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
