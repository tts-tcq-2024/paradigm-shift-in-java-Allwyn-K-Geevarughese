package vitals;

public class RangeValidator {

    ////Parameters with minimum value and maximum value
    public static boolean isParameterInRange(float actualValue, float minValue, float maxValue, String message) {
        if (maxValue < actualValue || minValue > actualValue) {
            System.out.println(message);
            return false;
        }
        return true;
    }
	
	 public static boolean isParameterInWarningRange(float actualValue, float minValue, float maxValue, float tolerance, String message) {
	        float lowerWarningLimit = minValue + tolerance;
	        float upperWarningLimit = maxValue - tolerance;
	        if ((lowerWarningLimit <= actualValue && actualValue <= minValue) || 
	            (maxValue <= actualValue && actualValue <= upperWarningLimit)) {
	            System.out.println(message);
	            return true;
	        }
	        return false;
	    }

   
    
}
