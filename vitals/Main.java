package vitals;

public class Main {
      public static void main(String[] args) {
           assert (!BatteryChecker.isBatteryOk(25, 50, 0.5f));  // All parameters are within range
assert (BatteryChecker.isBatteryOk(45, 80, 0.8f));  // Maximum valid values for all parameters
assert (BatteryChecker.isBatteryOk(0, 20, 0.0f));   // Minimum valid values for all parameters
assert (BatteryChecker.isBatteryOk(44.5f, 79.5f, 0.79f));  // Close to upper limits, but still valid
assert (BatteryChecker.isBatteryOk(0.5f, 21, 0.01f));  // Close to lower limits, but still valid

            
         
    }
}
