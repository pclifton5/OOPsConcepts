package DishWare;

public class Plates extends Dishes {
    //Fields
    private boolean fineChina;
    private boolean aPlate;

    //Constructors
    public Plates(String itemName, int howMany, String color, String material, boolean broken, boolean isDirty, boolean fineChina, boolean aPlate) {
        super(itemName, howMany, color, material, broken, isDirty);
        this.fineChina = fineChina;
        this.aPlate = aPlate;
    }

    //Getters and Setters
    public boolean isFineChina() {
        return fineChina;
    }

    public void setFineChina(boolean fineChina) {
        this.fineChina = fineChina;
    }

    public boolean isaPlate() {
        return aPlate;
    }

    public void setaPlate(boolean aPlate) {
        this.aPlate = aPlate;
    }

    //Methods
    public String ifFineChina(){
        if (fineChina==true){
            return"This is fine china and should be handled with care";
        }{
            return "";
        }
    }
    public String isAPlate() {
        if (aPlate == true) {
            return "This is a plate.";
        }{
            return "";
        }
    }

    //ToString
    @Override
    public String toString() {
        return getItemName()+"\n"+
                "There are "+getHowMany()+" of these dishes.\n"+
                "Its the color "+getColor()+"\n"+
                "Its made out of "+getMaterial()+"\n" +
                dishBroken() + "\n" +
                DishDirty()+"\n" +
                ifFineChina()+"\n"+
                isAPlate();

    }
}

