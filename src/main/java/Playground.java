public class Playground extends Attraction implements ISecurity{

    private String name;

    public Playground(String name){
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 15){
            return true;
        }else{
            return false;
        }
    }
}
