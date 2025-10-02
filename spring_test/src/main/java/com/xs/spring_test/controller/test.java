package com.xs.spring_test.controller;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = null;

        clazz=String.class;
        System.out.println(clazz);

        clazz="ReflectionTest".getClass();
        System.out.println(clazz);

        clazz=Class.forName("java.lang.String");
        System.out.println(clazz);
    }
}
//操作一手看看