package DishWare;

public class Bowls extends Dishes{
    //Fields
    private boolean aBowl;
    private String usedFor;
    //Constructors
    public Bowls(String itemName, int howMany, String color, String material, boolean broken, boolean isDirty, boolean aBowl, String usedFor) {
        super(itemName, howMany, color, material, broken, isDirty);
        this.aBowl = aBowl;
        this.usedFor = usedFor;
    }

    //Getters and Setters
    public boolean isaBowl() {
        return aBowl;
    }

    public void setaBowl(boolean aBowl) {
        this.aBowl = aBowl;
    }

    public String getUsedFor() {
        return usedFor;
    }

    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }

    //Methods
    public String isABowl(){
        if (aBowl==true){
            return "This is a bowl";
        }{
            return "";
        }
    }
    //ToString

    @Override
    public String toString() {
        return getItemName()+"\n"+
                "There are "+getHowMany()+" of these dishes.\n"+
                "It's the color "+getColor()+"\n"+
                "It's made out of "+getMaterial()+"\n" +
                dishBroken() + "\n" +
                DishDirty()+"\n"+
                isABowl()+"\n"+
                "It's used for "+usedFor;

    }
}
