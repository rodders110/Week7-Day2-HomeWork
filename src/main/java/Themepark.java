import java.util.ArrayList;

public class Themepark {
    private ArrayList<IReviewed> reviewed;
    private String name;


    public Themepark(String name) {
        this.name = name;
        this.reviewed = new ArrayList<IReviewed>();
    }

    public void add(IReviewed reviewed){
        this.reviewed.add(reviewed);
    }

    public String getName() {
        return name;
    }

    public ArrayList<IReviewed> getReviewed() {

        return reviewed;
    }
}
