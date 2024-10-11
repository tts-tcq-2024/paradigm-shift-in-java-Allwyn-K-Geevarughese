
package vitals;

public class BatteryChecker {

	
	  // public static boolean checkTemperatureInRange(float temperature) {
	  //       return RangeValidator.isParameterInRange(temperature, 0, 45, "Temperature out of range!");
	  //   }

	public static boolean checkTemperatureInRange(float temperature) {
		float tolerance = 0.05f * 45; // 5% of 45
		return RangeValidator.isParameterInRange(temperature, 0, 45, "Temperature out of range!") && RangeValidator
				.isParameterInWarningRange(temperature, 0, 45, tolerance, "Temperature approaching limit!");
	}

	    public static boolean checkSocInRange(float soc) {
	        return RangeValidator.isParameterInRange(soc, 20, 80, "State of Charge out of range!");
	    }

	    public static boolean checkChargeRateInRange(float chargeRate) {
	        return RangeValidator.isParameterInRange(chargeRate,0f, 0.8f, "Charge Rate out of range!");
	    }
	
	
	    public static boolean checkTemperatureInWarningRange(float temperature) {
	        float tolerance = 0.05f * 45; // 5% of 45
	        return RangeValidator.isParameterInWarningRange(temperature, 0, 45, tolerance, "Temperature approaching limit!");
	    }

	    public static boolean checkSocInWarningRange(float soc) {
	        float tolerance = 0.05f * 80; // 5% of 80
	        return RangeValidator.isParameterInWarningRange(soc, 20, 80, tolerance, "State of Charge approaching limit!");
	    }

	    public static boolean checkChargeRateInWarningRange(float chargeRate) {
	        float tolerance = 0.05f * 0.8f; // 5% of 0.8
	        return RangeValidator.isParameterInWarningRange(chargeRate, Float.MIN_VALUE, 0.8f, tolerance, "Charge Rate approaching limit!");
	    }

	    public static boolean isBatteryOk(float temperature, float soc, float chargeRate) {
	        boolean isTemperatureOk = checkTemperatureInRange(temperature);
	        boolean isSocOk = checkSocInRange(soc);
	        boolean isChargeRateOk = checkChargeRateInRange(chargeRate);

	        // Check if parameters are within warning ranges
	        boolean isTemperatureInWarningRange = checkTemperatureInWarningRange(temperature);
	        boolean isSocInWarningRange = checkSocInWarningRange(soc);
	        boolean isChargeRateInWarningRange = checkChargeRateInWarningRange(chargeRate);

	        return isTemperatureOk && isSocOk && isChargeRateOk && !isTemperatureInWarningRange && !isSocInWarningRange && !isChargeRateInWarningRange;
	    }
}
