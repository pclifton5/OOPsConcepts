package DishWare;

public class Cups extends Dishes{
    //Fields
    private String usedFor;
    //Constructors
    public Cups(int howMany, String color, String material, boolean broken, boolean isDirty, String usedFor) {
        super(howMany, color, material, broken, isDirty);
        this.usedFor = usedFor;
    }

    //Getters and Setters
    public String getUsedFor() {
        return usedFor;
    }
    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }

    //Methods

    //ToString

    @Override
    public String toString() {
        return "Cups{" +
                "usedFor='" + usedFor + '\'' +
                '}';
    }
}

