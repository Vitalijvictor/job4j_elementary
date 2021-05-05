package Loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while( amount * percent < salary ) {
        	year = (int) (salary - (amount * percent));
        }
        return year;
    }
}
