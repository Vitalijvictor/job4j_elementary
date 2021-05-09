package ru.job4j.array;

public class ForEachUsage {
	public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Petr";
        names[1] = "Ivan";
        names[2] = "Fedor";
        names[3] = "Nikolay";
        for (String name : names) {
            System.out.println(name);
        }
    }
}
