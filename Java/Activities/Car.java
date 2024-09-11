package Activities;

public class Car {
    String color;
    String transmission;
    int make;
    int tyre;
    int doors;

    Car() {
        tyre = 4;
        doors = 4;
    }

    public void displayCharacteristics(){
        System.out.println("Colour of the car is : " + color);
        System.out.println("transmission of the car is: " + transmission);
        System.out.println("make of the car is: " + make);
        System.out.println("Number of tyre in the car is: " + tyre);
        System.out.println("Number of doors in the car is: " + doors);
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }
    public void brake(){
        System.out.println("Car has stopped");
    }




}
