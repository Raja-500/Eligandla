package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    Plane(int maxPassengers){
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String name){
        passengers.add(name);
    }
    public Date takeOff(){
        return (lastTimeTookOf = new Date());
    }
    public void land(){
        lastTimeLanded = new Date();
        passengers.clear();
    }
    public Date getLastTimeLanded(){
        return lastTimeLanded;
    }
    public List<String> getPassesngers(){
        return passengers;
    }

}