package condition;

public class SqArea {
    public static double square(int p, double k) {
        double h = p / (2 * (k + 1));
        double w = h * k;
        double s = w + h;
        double rsl = s;
        return rsl;
    }
    

    public static void main(String[] args) {
        double result1 = SqArea.square(24, 2);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);
    }
}
