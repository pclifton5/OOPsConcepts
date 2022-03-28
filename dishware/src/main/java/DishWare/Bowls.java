package DishWare;

public class Bowls extends Dishes{
    //Fields

    //Constructors

    public Bowls(String itemName, int howMany, String color, String material, boolean broken, boolean isDirty) {
        super(itemName, howMany, color, material, broken, isDirty);
    }

    //Getters and Setters

    //Methods

    //ToString

    @Override
    public String toString() {
        return getItemName()+"\n"+
                "There are "+getHowMany()+" of these dishes.\n"+
                "It's the color "+getColor()+"\n"+
                "It's made out of "+getMaterial()+"\n" +
                dishBroken() + "\n" +
                DishDirty();
    }
}
