package Activities;

import java.util.HashSet;
import java.util.Set;

public class Activity_10 {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("Obj1");
        names.add("Obj2");
        names.add("Obj3");
        names.add("Obj4");
        names.add("Obj5");
        names.add("Obj6");
        System.out.println("Size of HashSet is " + names.size());
        names.remove("Obj3");
        if(names.remove("Obj7")){
            System.out.println("Obj7 has been removed");
        }
        else{
            System.out.println("Obj7 is not present in HashSet");
        }
        if(names.contains("Obj1")){
            System.out.println("Obj1 is present in HashSet");
        }
        else {
            System.out.println("Obj1 is not present in HashSet");
        }
        for(String x:names){
            System.out.println(x);
        }
    }
}
