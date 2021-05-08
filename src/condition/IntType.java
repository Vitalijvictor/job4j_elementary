package condition;

import java.util.Scanner;

public class IntType {
    public static void main(String[] args) {
        Scanner nextInt = new Scanner(System.in);
        Scanner value = nextInt;
        System.out.println(value.toString());
        nextInt.close();
    }
}