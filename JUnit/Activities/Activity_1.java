import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity_1 {
    static ArrayList<String> list;

    @BeforeEach
    void setup(){
        list = new ArrayList<String>();
        list.add("alpha");
        list.add("Beta");
    }
    @Test
    @Order(2)
    void insertTest(){
        assertEquals(2,list.size(),"Wrong Size");
        list.add("Gama");
        assertEquals(3,list.size());
        assertEquals("Gama", list.get(2));
    }
    @Test
    @Order(1)
    void replaceTest(){
       assertEquals(2,list.size(),"In replace method wrong Size");
       list.add("Delta");
       assertEquals(3,list.size());
       list.set(1,"Yummy");
       assertEquals("Yummy", list.get(1));
    }
}
