public class Dodgems extends Attraction {

    public Dodgems(String name){
        super(name);
    }


    public String startRide() {
        return "Ride Started";
    }

    public String stopRide() {
        return "Stopped";
    }
}
