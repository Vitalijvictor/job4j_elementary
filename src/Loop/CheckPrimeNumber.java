package Loop;

	public class CheckPrimeNumber {
	    public static boolean check(int number) {
	        boolean prime = true;
	        for (int index = 1; index <= number; index++)
	        	if ((number % 2) == 0) {
	        		prime = false;
	        		break;
	        		}
	        	else {
	        		break;
				}
					return prime; 
	    }
	}
