package vitals;

public class BatteryChecker {

    private static final float TEMPERATURE_MIN = 0;
    private static final float TEMPERATURE_MAX = 45;
    private static final float SOC_MIN = 20;
    private static final float SOC_MAX = 80;
    private static final float CHARGE_RATE_MIN = 0f;
    private static final float CHARGE_RATE_MAX = 0.8f;

    // Consolidate tolerance calculation into a helper method
    private static float calculateTolerance(float maxRange) {
        return 0.05f * maxRange; // 5% tolerance
    }

    public static boolean checkTemperatureInRange(float temperature) {
        return checkInRangeAndWarning(temperature, TEMPERATURE_MIN, TEMPERATURE_MAX, "Temperature");
    }

    public static boolean checkSocInRange(float soc) {
        return checkInRangeAndWarning(soc, SOC_MIN, SOC_MAX, "State of Charge");
    }

    public static boolean checkChargeRateInRange(float chargeRate) {
        return checkInRangeAndWarning(chargeRate, CHARGE_RATE_MIN, CHARGE_RATE_MAX, "Charge Rate");
    }

    // Helper method to check both range and warning range for parameters
    private static boolean checkInRangeAndWarning(float value, float min, float max, String parameterName) {
        float tolerance = calculateTolerance(max);
        return checkInRange(value, min, max, parameterName) && 
               checkInWarningRange(value, min, max, tolerance, parameterName);
    }

    // Helper method for normal range checking
    private static boolean checkInRange(float value, float min, float max, String parameterName) {
        return RangeValidator.isParameterInRange(value, min, max, parameterName + " out of range!");
    }

    // Helper method for warning range checking
    private static boolean checkInWarningRange(float value, float min, float max, float tolerance, String parameterName) {
        return RangeValidator.isParameterInWarningRange(value, min, max, tolerance, parameterName + " approaching limit!");
    }

    public static boolean isBatteryOk(float temperature, float soc, float chargeRate) {
        boolean isTemperatureOk = checkTemperatureInRange(temperature);
        boolean isSocOk = checkSocInRange(soc);
        boolean isChargeRateOk = checkChargeRateInRange(chargeRate);

        return isTemperatureOk && isSocOk && isChargeRateOk;
    }
}
