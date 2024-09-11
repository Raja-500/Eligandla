package Activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] array = {10, 77, 10, 54, -11, 10};
        int sum = 0;
        for (int x: array){
            if (x ==10){
                sum += x;
            }
        }
        if (sum ==30){
            System.out.println("Sum of 10's is equal to 30");
        }
        else {
            System.out.println(" Sum of 10's is not equal to 30");
        }
    }
}
