package SingleInheritance.SmartHomeDevices;

//class device - parent class
class Device{
    private int deviceId;
    private String status;

    //constructor of class device
    Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    //method to display status
    public void displayStatus(){
        System.out.println("Device details - " + "\nDevice ID - " + deviceId + " Device Status - " + status);
    }
}

//class thermostat - subclass
class Thermostat extends Device{
    private int temperatureSetting;

    //constructor of thermostat
    Thermostat(int deviceId, String status, int temperatureSetting){
       super(deviceId, status);
       this.temperatureSetting = temperatureSetting;
    }

    //overriding display status
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting - " + temperatureSetting);
    }
}

//main class
public class SmartHomeDevice {
    public static void main(String[] args) {

        //thermostat object
        Device thermo = new Thermostat(22, "xyz", 10);

        //displaying status
        thermo.displayStatus();
    }
}
