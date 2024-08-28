package vitals;

public class Main {
    static boolean batteryIsOk(float temperature, float soc, float chargeRate) {
        return isTemperatureOk(temperature) && isStateOfChargeOk(soc) && isChargeRateOk(chargeRate);
    }

    private static boolean isTemperatureOk(float temperature) {
        return temperature >= 0 && temperature <= 45;
    }

    private static boolean isStateOfChargeOk(float soc) {
        return soc >= 20 && soc <= 80;
    }

    private static boolean isChargeRateOk(float chargeRate) {
        return chargeRate <= 0.8;
    }

    public static void main(String[] args) {
        assert(batteryIsOk(25, 70, 0.7f) == true);
        assert(batteryIsOk(50, 85, 0.0f) == false);
        assert(isTemperatureOk(-4) == false); 
        assert(isStateOfChargeOk(5) == false); 
        assert(isChargeRateOk(1.1f) == false);
        assert(isTemperatureOk(44) == true);
        assert(isStateOfChargeOk(21) == true); 
        assert(isChargeRateOk(0.1f) == true);
        System.out.println("All tests passed");
    }
}

