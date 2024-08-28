package vitals;

public class Main {
    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        return isTemperatureInRange(temperature) &&
               isStateOfChargeInRange(soc) &&
               isChargeRateInRange(chargeRate);
    }

    private static boolean isTemperatureInRange(float temperature) {
        return temperature >= 0 && temperature <= 45;
    }

    private static boolean isStateOfChargeInRange(float soc) {
        return soc >= 20 && soc <= 80;
    }

    private static boolean isChargeRateInRange(float chargeRate) {
        return chargeRate <= 0.8;
    }

    public static void main(String[] args) {
        assert(batteryIsOk(25, 70, 0.7f) == true);
        assert(batteryIsOk(50, 85, 0.0f) == false);
        assert(isTemperatureInRange(-4) == false); 
        assert(isStateOfChargeInRange(5) == false); 
        assert(isChargeRateInRange(1.1f) == false);
        assert(isTemperatureInRange(44) == true);
        assert(isStateOfChargeInRange(21) == true); 
        assert(isChargeRateInRange(0.1f) == true);
    }
}

