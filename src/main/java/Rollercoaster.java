import java.util.ArrayList;

public class Rollercoaster extends Attraction implements ISecurity{


    public Rollercoaster(String name) {
        super(name);
    }

    public String startRide(){
        return "Ride Started";
    }

    public String stopRide(){
        return "Stopped";
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() >= 12 && visitor.getHeight() >= 145){
            return true;
        }else{
            return false;
        }
    }
}
