package vitals;

public class BatteryChecker {

    public static boolean checkTemperatureInRange(float temperature) {
        return RangeValidator.isParameterInRange(temperature, 0, 45, "Temperature out of range!");
    }

    public static boolean checkSocInRange(float soc) {
        return RangeValidator.isParameterInRange(soc, 20, 80, "State of Charge out of range!");
    }

    public static boolean checkChargeRateInRange(float chargeRate) {
        return RangeValidator.isParameterInRange(chargeRate, 0, 0.8f, "Charge Rate out of range!");
    }

    public static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        return checkTemperatureInRange(temperature) &&
               checkSocInRange(soc) &&
               checkChargeRateInRange(chargeRate);
    }
}
