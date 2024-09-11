package Activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane vistara = new Plane(10);

        vistara.onboard("Saurav");
        vistara.onboard("Ashish");
        vistara.onboard("Anna");

        System.out.println(" Take Off time " + vistara.takeOff());
        System.out.println("Passengers are " + vistara.getPassesngers());
        Thread.sleep(5000);
        vistara.land();
        System.out.println("Landing time " + vistara.getLastTimeLanded());
    }

}
