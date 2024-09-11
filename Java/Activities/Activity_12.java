package Activities;

interface Addable{
    int add(int num1, int num2);
}


public class Activity_12 {
    public static void main(String[] args) {
        Addable ad1;
        Addable ad2;
        ad1 = (num1,num2) -> num1+num2;
        System.out.println(ad1.add(20,40));
        ad2 = (int num1, int num2) -> {
            return (num1+num2) ;
        };
        System.out.println(ad2.add(80,90));


    }
}
