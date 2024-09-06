package vitals;

public class RangeValidator {

    public static boolean isParameterInRange(float actualValue, float minValue, float maxValue, String message) {
        if (maxValue < actualValue || minValue > actualValue) {
            System.out.println(message);
            return false;
        }
        return true;
    }
    public static boolean isParameterInRange(float actualValue, float minValue, float maxValue, String message) {
        return isParameterInRange(actualValue, Float.MIN_VALUE, maxValue, message);
    }
    
}
