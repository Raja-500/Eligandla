package Activities;

interface BicycleParts{
    public int gears =0;
    public int currentSpeed =0;
}

interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleOperations, BicycleParts{
    public int gears;
    public int currentSpeed;

    public Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    public void applyBrake(int dec){
        currentSpeed = currentSpeed - dec;

    }
    public void speedUp(int inc){
        currentSpeed = currentSpeed + inc;
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

class MountainBike extends Bicycle{
    int seatHeight;
    public MountainBike(int gear, int currentSpeed, int seatHeight) {
        super(gear,currentSpeed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed + "\nSeat Height of bicycle is" + seatHeight);
    }

}

public class Activity7 {
    public static void main(String[] args) {
        MountainBike heroranger = new MountainBike(3,10,25);
        System.out.println(heroranger.bicycleDesc());
        heroranger.applyBrake(5);
        System.out.println(heroranger.bicycleDesc());
        heroranger.speedUp(10);
        heroranger.setHeight(20);
        System.out.println(heroranger.bicycleDesc());

    }
}
