package ru.job4j.convert;

public class Converter {

    public static double rubleToEuro(double value) {
        
    	return value / 70;
    }

    public static double rubleToDollar(double value) {
        
    	return value / 60;
    }

    public static double rubleToPound(double value) {

        return value / 80;
    }

    public static void main(String[] args) {
    	double euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        
    	double in = 140;
    	double expected = 2;
    	double out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
