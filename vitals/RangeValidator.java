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

    if (isInLowerWarningRange(actualValue, minValue, lowerWarningLimit) || 
        isInUpperWarningRange(actualValue, maxValue, upperWarningLimit)) {
        System.out.println(message);
        return true;
    }
    return false;
}

private static boolean isInLowerWarningRange(float actualValue, float minValue, float lowerWarningLimit) {
    return lowerWarningLimit <= actualValue && actualValue <= minValue;
}

private static boolean isInUpperWarningRange(float actualValue, float maxValue, float upperWarningLimit) {
    return maxValue <= actualValue && actualValue <= upperWarningLimit;
}
