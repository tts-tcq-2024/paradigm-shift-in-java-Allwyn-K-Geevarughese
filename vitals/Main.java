package vitals;

public class Main {
      public static void main(String[] args) {
            assert (BatteryChecker.batteryIsOk(0, 20, 0.8f)); // All  parameters at maximum value
            assert (BatteryChecker.batteryIsOk(10, 25, 0.5f));  // All parameters in range
            assert (!BatteryChecker.batteryIsOk(50, 85, 0.0f)); // Everything out of range
            assert (!BatteryChecker.batteryIsOk(-10, 70, 0.5f)); //Temperature Out of range
            assert (!BatteryChecker.batteryIsOk(25, 90, 0.5f)); // State Of Charge Out of range
            assert (!BatteryChecker.batteryIsOk(25, 70, 1.0f)); // Charge Rate Out of range
    }
}
