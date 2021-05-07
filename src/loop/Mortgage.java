package loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double dAmount = (double) amount;
        double dSalary = (double) salary;
        
        percent = percent / 100;
        
        while (dAmount > 0) {
        	dAmount = dAmount + (dAmount * percent) - dSalary;   
        	System.out.println(dAmount);
        	year++;        	
        }
        return year;
    }
    

    
    /*public static void main(String[] args) {
		System.out.println(Mortgage.year(100, 70, 50));
	}*/
}
