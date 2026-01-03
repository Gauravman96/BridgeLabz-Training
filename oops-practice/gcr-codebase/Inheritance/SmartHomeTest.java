// Superclass: Device
class Device {
    String deviceId;
    String status;

    // Constructor
    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display basic device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}


class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);  // Call to superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus(); 
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeTest {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH123", "ON", 24.5);
        thermostat.displayStatus();
    }
}
