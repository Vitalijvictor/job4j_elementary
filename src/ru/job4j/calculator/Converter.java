package ru.job4j.calculator;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = 60; /* формула перевода рублей в доллары. */
        return rsl;
    }
    
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " euro.");
        System.out.println("140 rubles are " + euro + " euro.");
    }   
}