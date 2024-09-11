package Activities;

import java.util.ArrayList;
import java.util.List;

public class Activity_9 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Saurav");
        myList.add("Sanmya");
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Mango");

        for(String name:myList){
            System.out.print(" " + name);
        }
        System.out.println();
        System.out.println("3rd Item of my list is  " + myList.get(2));
        if(myList.contains("Orange")){
            System.out.println("Saurav exist in the list");
        }
        else{
            System.out.println("Saurav does not exist in the list");
        }
        System.out.println("Size of list is " + myList.size());
        myList.remove("Orange");
        System.out.println("After removing item Orange, Size of list is " + myList.size());

    }
}
