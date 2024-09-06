package vitals;

public class Main {
      public static void main(String[] args) {
          
        assert (BatteryChecker.batteryIsOk(25, 70, 0.7f));
        assert (!BatteryChecker.batteryIsOk(50, 85, 0.0f));
        assert (!BatteryChecker.batteryIsOk(-10, 70, 0.5f));
        assert (!BatteryChecker.batteryIsOk(25, 90, 0.5f));
        assert (!BatteryChecker.batteryIsOk(25, 70, 1.0f));
        assert (BatteryChecker.batteryIsOk(0, 20, 0.8f));
    }
}

