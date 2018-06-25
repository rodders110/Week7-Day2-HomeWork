import java.util.ArrayList;

public class Visitor {

    private String name;
    private int age;
    private int height;
    private double funds;
    private ArrayList<Visitor> visitors;

    public Visitor(String name, int age, int height, double funds){
        this.name = name;
        this.age = age;
        this.height = height;
        this.funds = funds;
        this.visitors = new ArrayList<Visitor>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getFunds() {
        return funds;
    }

    public void deductFunds(double i) {
        this.funds -= i;
    }
}
