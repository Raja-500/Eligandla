package Activities;

public class Activity1 {
    public static void main(String[] args) {
        Car toyata = new Car();
        toyata.make = 2014;
        toyata.transmission = "manual";
        toyata.color = "Black";

        toyata.displayCharacteristics();
        toyata.accelerate();
        toyata.brake();
    }


}
