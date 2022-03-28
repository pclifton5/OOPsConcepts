package DishWare;

public class Plates extends Dishes {
    //Fields
    private boolean fineChina;

    //Constructors

    public Plates(String itemName, int howMany, String color, String material, boolean broken, boolean isDirty, boolean fineChina) {
        super(itemName, howMany, color, material, broken, isDirty);
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
    public String ifFineChina(){
        if (fineChina==true){
            return"This is fine china and should be handled with care";
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
                ifFineChina();

    }
}

