package VehicleandTransportSystem;

//vehicle class - super class
class Vehicle{
    private int maxSpeed;
    private String fuelType;

    //constructor of vehicle
    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    //method to display info
    public void displayInfo(){
        System.out.println("Max speed - " + maxSpeed + " fuelType - " + fuelType);
    }
}

//car class - subclass
class Car extends Vehicle{

    private int seatCapacity;

    //constructor of car
    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    //overriding display method
    @Override
    public void displayInfo() {
        System.out.println("Car Details - ");
        super.displayInfo();
        System.out.println("Seat Capacity - " + seatCapacity);
    }
}

//truck class - subclass
class Truck extends Vehicle{
    private String sound;

    //truck class constructor
    Truck(int maxSpeed, String fuelType, String sound){
        super(maxSpeed, fuelType);
        this.sound = sound;
    }

    //overriding display method
    @Override
    public void displayInfo() {
        System.out.println("Truck details - ");
        super.displayInfo();
        System.out.println("Truck sound - " + sound);
    }
}

//motorcycle class
class Motorcycle extends Vehicle{

    private String color;

    //constructor of motorcycle class
    Motorcycle(int maxSpeed, String fuelType, String color){
        super(maxSpeed, fuelType);
        this.color = color;
    }

    //overriding display method
    @Override
    public void displayInfo() {
        System.out.println("MotorCycle Details - ");
        super.displayInfo();
        System.out.println("MotorCycle Color - " + color);
    }
}

//main class
public class VehicleTransport {
    public static void main(String[] args) {

        //create obj of all subclasses
        Vehicle car = new Car(100, "Diesel" , 6);
        Vehicle truck = new Truck(200, "Petrol", "dhundhundhun...");
        Vehicle motorcycle = new Motorcycle(50, "Petrol", "Blue");

        //displaying details of all subclasses
        car.displayInfo();
        truck.displayInfo();
        motorcycle.displayInfo();
    }
}
