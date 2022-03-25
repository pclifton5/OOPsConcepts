package DishWare;

public class Plates extends Dishes{
    //Fields
    private boolean fineChina;

    //Constructors
    public Plates(int howMany, String color, String material, boolean broken, boolean isDirty, boolean fineChina) {
        super(howMany, color, material, broken, isDirty);
        this.fineChina = fineChina;
    }

    //Getters and Setters

    public boolean isFineChina() {
        return fineChina;
    }

    public void setFineChina(boolean fineChina) {
        this.fineChina = fineChina;
    }

    //Methods

    //ToString
}
