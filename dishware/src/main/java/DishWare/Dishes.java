package DishWare;

public class Dishes{
    //Fields
    private String itemName;
    private int howMany;
    private String color;
    private String material;
    private boolean broken;
    private boolean isDirty;

    //Constructors
    public Dishes() {
    }

    public Dishes(String itemName,int howMany, String color, String material, boolean broken, boolean isDirty) {
        this.itemName = itemName;
        this.howMany = howMany;
        this.color = color;
        this.material = material;
        this.broken = broken;
        this.isDirty = isDirty;
    }

    //Getters and Setters

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
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
    public String dishBroken() {
        if (broken == true) {
            return "It's broken";
        }else{
            return "It's ready for use";
        }
    }

    public String DishDirty(){
        if(isDirty==true){
            return "It needs cleaning";
        }else{
            return "It's clean";
        }
    }
    //ToString
    @Override
    public String toString() {
        return itemName+"\n"+
                "There are "+howMany+" of these dishes.\n"+
                "Its the color "+color+"\n"+
                "Its made out of "+material+"\n" +
                dishBroken() + "\n" +
                DishDirty();
    }
}
