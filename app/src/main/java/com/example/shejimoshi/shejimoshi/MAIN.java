package com.example.shejimoshi.shejimoshi;

import com.example.shejimoshi.shejimoshi.dali.SingletonDemo1;
import com.example.shejimoshi.shejimoshi.dali.SingletonDemo2;
import com.example.shejimoshi.shejimoshi.dali.SingletonDemo3;
import com.example.shejimoshi.shejimoshi.dali.SingletonDemo4;

/**
 * Created by beixinyuan_android on 2018/3/26.
 */

public class MAIN {

    public static void main(String[] args){

        //懒汉式单例设计模式
        SingletonDemo1 singletonDemo1 = SingletonDemo1.getInstance();
        System.out.println("SingletonDemo1对象名称："+singletonDemo1.toString());
        singletonDemo1 = SingletonDemo1.getInstance();
        System.out.println("SingletonDemo1对象名称："+singletonDemo1.toString());

        //饿汉式单例模式
        SingletonDemo2 singletonDemo2 = SingletonDemo2.getInstance();
        System.out.println("SingletonDemo2对象名称："+singletonDemo2.toString());
        singletonDemo2 = SingletonDemo2.getInstance();
        System.out.println("SingletonDemo2对象名称："+singletonDemo2.toString());

        //双重锁定单例设计模式
        SingletonDemo3 singletonDemo3 = SingletonDemo3.getInstance();
        System.out.println("SingletonDemo3对象名称："+singletonDemo3.toString());
        singletonDemo3 = SingletonDemo3.getInstance();
        System.out.println("SingletonDemo3对象名称："+singletonDemo3.toString());

        //静态内部类单例模式
        SingletonDemo4 singletonDemo4 = SingletonDemo4.getInstance();
        System.out.println("SingletonDemo4对象名称："+singletonDemo4.toString());
        singletonDemo4 = singletonDemo4.getInstance();
        System.out.println("SingletonDemo4对象名称："+singletonDemo4.toString());


    }

}
