package DishWare;

public class Cups extends Dishes{
    //Fields
    private boolean isCup;
    private String usedFor;
    //Constructors
    public Cups(String itemName, int howMany, String color, String material, boolean broken, boolean isDirty, boolean isCup, String usedFor) {
        super(itemName, howMany, color, material, broken, isDirty);
        this.isCup = isCup;
        this.usedFor = usedFor;
    }

    //Getters and Setters
    public String getUsedFor() {
        return usedFor;
    }
    public void setUsedFor(String usedFor) {
        this.usedFor = usedFor;
    }
    public boolean isCup() {
        return isCup;
    }

    public void setCup(boolean cup) {
        isCup = cup;
    }

    //Methods
    public String ifCup(){
        if (isCup==true){
            return "This is a cup";
        }return "";
    }
    //ToString

    @Override
    public String toString() {
        return getItemName()+"\n"+
                "There are "+getHowMany()+" of these dishes.\n"+
                "It's the color "+getColor()+"\n"+
                "It's made out of "+getMaterial()+"\n" +
                dishBroken() + "\n" +
                DishDirty()+"\n" +
                ifCup()+"\n"+
                "It's used for "+usedFor;
    }
}






