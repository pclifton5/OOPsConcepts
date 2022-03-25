package DishWare;

public class Dishes extends Main {
    //Fields
    private int howMany;
    private String color;
    private String material;
    private boolean broken;
    private boolean isDirty;

    //Constructors
    public Dishes(int howMany, String color, String material, boolean broken, boolean isDirty) {
        this.howMany = howMany;
        this.color = color;
        this.material = material;
        this.broken = broken;
        this.isDirty = isDirty;
    }

    //Getters and Setters
    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isBroken() {
        return broken;
    }

    public void setBroken(boolean broken) {
        this.broken = broken;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    //Methods

    //ToString
    @Override
    public String toString() {
        return "Dishes{" +
                "howMany=" + howMany +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", broken=" + broken +
                ", isDirty=" + isDirty +
                '}';
    }
}
