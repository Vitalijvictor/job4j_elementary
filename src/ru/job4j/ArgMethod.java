package ru.job4j;

public class ArgMethod {

    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void age(int age) {
        System.out.println("You are "+ age +" year old");
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;
        
        ArgMethod.hello(name);
        ArgMethod.age(age);

        
    }
}