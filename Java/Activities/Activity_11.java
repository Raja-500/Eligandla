package Activities;

import java.util.HashMap;
import java.util.Map;

public class Activity_11 {
    public static void main(String[] args) {
        Map<Integer, String> colours = new HashMap<>();
        colours.put(1,"Red");
        colours.put(2,"Orange");
        colours.put(3,"Green");
        colours.put(4,"Peach");
        colours.put(5,"Blue");
        System.out.println(colours.values());
        if(colours.remove(2,"Orange")){
            System.out.println("Colour orange has been removed");
        }
        else{
            System.out.println("Colour orange has not been found");
        }
        if(colours.containsValue("Green")){
            System.out.println("Colour Green exist");
        }
        else{
            System.out.println("Colour Green does not exist");
        }
        System.out.println("Size of HashMap is " + colours.size());
    }
}
