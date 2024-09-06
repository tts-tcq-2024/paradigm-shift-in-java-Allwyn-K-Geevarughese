package vitals;

public class RangeValidator {

    public static boolean isParameterInRange(float actualValue, float minValue, float maxValue, String message) {
        if ( minValue > actualValue || maxValue < actualValue) {
            System.out.println(message);
            return false;
        }
        return true;
    }
}
