package com.startjava.lesson_2_3.person;

public class Person {
    char sex = 'M';
    String name = "Андрей";
    int height = 185;
    int weight = 73;
    int age = 29;

    // идти, сидеть, бежать, говорить, учить Java
    void walk() {
        System.out.println( name + " идёт.");
    }

    void sit() {
        System.out.println( name + " сидит.");
    }

    void run() {
        System.out.println( name + " бежит.");
    }

    void talk() {
        System.out.println( name + " говорит.");
    }

    void learnJava() {
        System.out.println( name + " изучает Java.");
    }
}