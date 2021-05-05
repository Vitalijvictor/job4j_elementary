package Loop;

	public class CheckPrimeNumber {
	    public static boolean check(int number) {
	        boolean prime = number >1;
	        for (int index = 2; index <= number; index++)
	        	if ((number % index) == 0) {
	        		prime = false;
	        		break;
	        		}
	        	else {
	        		prime = true;
	        		break;
				}
					return prime; 
	    }
	}
