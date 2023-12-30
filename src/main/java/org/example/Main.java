package org.example;

public class Main {
    public static void main(String[] args) {
        Person jaemin = new Person("재민", 20);
        System.out.println(jaemin);
        System.out.println(jaemin.getName());
        System.out.println(jaemin.getAge());

        Person kitae = new Person("기태", 52);
        System.out.println(kitae);
        System.out.println(kitae.getName());

    }
}