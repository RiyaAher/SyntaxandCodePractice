// ABSTRACT CLASS (The Blueprint)
abstract class SmartDevice {
    private String deviceName; // Encapsulated
    private int batteryLevel = 100;

    // CONSTRUCTOR
    public SmartDevice(String name) {
        this.deviceName = name;
    }

    // ENCAPSULATION: Getter for name
    public String getName() { return deviceName; }

    // ABSTRACTION: Every device does something different
    abstract void performAction();

    // ENCAPSULATION: Controlled access to battery
    public void useBattery(int amount) {
        batteryLevel -= amount;
        System.out.println(deviceName + " battery at: " + batteryLevel + "%");
    }
}

// INTERFACE (Behavioral Contract)
interface WiFiConnectable {
    void connectToNetwork(String ssid);
}

// 3. INHERITANCE: The Light
class SmartLight extends SmartDevice {
    public SmartLight(String name) {
        super(name); // Calling parent constructor
    }

    @Override
    void performAction() {
        System.out.println(getName() + " is shining bright white.");
    }
}

// 4. INHERITANCE + POLYMORPHISM: The Camera
class SmartCamera extends SmartDevice implements WiFiConnectable {
    public SmartCamera(String name) {
        super(name);
    }

    @Override
    void performAction() {
        System.out.println(getName() + " is recording movement...");
    }

    @Override
    public void connectToNetwork(String ssid) {
        System.out.println(getName() + " connected to WiFi: " + ssid);
    }
}

class Main {

    public static void main (String[] args){

        SmartDevice[] DiffDevices = new SmartDevice[2];

        DiffDevices[0] = new SmartLight("Led Light");
        DiffDevices[1] = new SmartCamera("Cam");

        for(SmartDevice D : DiffDevices){
            D.performAction();
        }
        
    }
}