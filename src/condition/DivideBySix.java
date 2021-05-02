package condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        
        boolean div2 = (number % 2) == 0;
        boolean div3 = (number % 3) == 0;        
        
        if (div3) {
            if (div2) {
                rsl =  "Исходное число делится на 6.";
            } else {
                rsl = "Исходное число делится на 3, но не является четным.";
            }
        } else {
            if (div2) {
                rsl =  "Исходное число не делится на 3, но является четным.";
            } else {
                rsl = "Исходное число не делится на 3 и не является четным.";
            }
        }
        
        return rsl;
    }
}
