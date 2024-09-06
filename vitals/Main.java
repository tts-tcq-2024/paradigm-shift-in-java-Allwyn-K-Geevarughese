package vitals;

public class Main {
      public static void main(String[] args) {
            assert (BatteryChecker.batteryIsOk(0, 20, 0.8f)); // All  parameters at maximum value
            assert (BatteryChecker.batteryIsOk(10, 25, 0.5f));  // All parameters in range
            assert (!BatteryChecker.batteryIsOk(100, 100, 0.0f)); // Everything out of range
            assert (!BatteryChecker.batteryIsOk(-25, 50, 0.4f)); //Temperature Out of range
            assert (!BatteryChecker.batteryIsOk(30, 100, 0.4f)); // State Of Charge Out of range
            assert (!BatteryChecker.batteryIsOk(10, 55, 10.0f)); // Charge Rate Out of range
    }
}
