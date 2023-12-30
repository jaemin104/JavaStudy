package org.example;

public class Main {
    public static void main(String[] args) {
        Person jaemin = new Person("재민", 20);
        System.out.println(jaemin);
        System.out.println(jaemin.getName());
        System.out.println(jaemin.getAge());

        Person hong = new Person("홍길동", 100);
        System.out.println(hong);
        System.out.println(hong.getName());


    }
}