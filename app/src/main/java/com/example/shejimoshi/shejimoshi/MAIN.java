package com.example.shejimoshi.shejimoshi;

import com.example.shejimoshi.shejimoshi.dali.SingletonDemo1;
import com.example.shejimoshi.shejimoshi.dali.SingletonDemo2;
import com.example.shejimoshi.shejimoshi.dali.SingletonDemo3;
import com.example.shejimoshi.shejimoshi.dali.SingletonDemo4;
import com.example.shejimoshi.shejimoshi.fatory.DellFactory;
import com.example.shejimoshi.shejimoshi.fatory.DellMouseFactoryB;
import com.example.shejimoshi.shejimoshi.fatory.HpFactory;
import com.example.shejimoshi.shejimoshi.fatory.HpMouseFactroyB;
import com.example.shejimoshi.shejimoshi.fatory.KeyBoard;
import com.example.shejimoshi.shejimoshi.fatory.Mouse;
import com.example.shejimoshi.shejimoshi.fatory.MouseFactoryA;

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

        //简单工厂模式(生产哪种鼠标由参数决定)(缺点：参数的意义不明确，使用困难)
        Mouse mouse1 = MouseFactoryA.createMouse(0);
        mouse1.sayHi();
        Mouse mouse2 = MouseFactoryA.createMouse(1);
        mouse2.sayHi();

        //工厂模式（生产哪种鼠标由对象决定）
        Mouse mouse3 = new DellMouseFactoryB().createMouse();
        mouse3.sayHi();
        Mouse mouse4 = new HpMouseFactroyB().createMouse();
        mouse4.sayHi();

        //抽象工厂模式
        //当抽象工厂模式的产品只有一个的时候，即变成工厂模式
        //当工厂模式的产品变成多个时，即变成抽象工厂模式
        Mouse mouse5 = new DellFactory().createMouse();
        mouse5.sayHi();
        KeyBoard keyBoard1 = new DellFactory().createKeyBoard();
        keyBoard1.sayHi();
        Mouse mouse6 = new HpFactory().createMouse();
        mouse6.sayHi();
        KeyBoard keyBoard2 = new HpFactory().createKeyBoard();
        keyBoard2.sayHi();
    }

}
