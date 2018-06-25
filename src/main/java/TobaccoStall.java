public class TobaccoStall extends Stall implements ISecurity{
    private String name;
    private String ownerName;
    private int parkingSpot;

    public TobaccoStall(String name, String ownerName, int parkingSpot){
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 18){
            return false;
        }else{
            return true;
        }
    }
}
