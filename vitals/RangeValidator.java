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
        boolean isLowerWarning = lowerWarningLimit <= actualValue && actualValue <= minValue;
        boolean isUpperWarning = maxValue <= actualValue && actualValue <= upperWarningLimit;

        if (isLowerWarning || isUpperWarning) {
            System.out.println(message);
            return true;
        }
        return false;
    }

   
    
}
