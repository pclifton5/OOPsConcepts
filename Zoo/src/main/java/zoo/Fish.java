package zoo;

public class Fish extends Animal{
    //Fields
    private int sizeInFeet;
    private boolean canEat;

    //Constructors
    public Fish(int age, String gender, String name) {
        super(age, gender, name);
    }

    //Getters and Setters
    public int getSizeInFeet() {
        return sizeInFeet;
    }

    public void setSizeInFeet(int sizeInFeet) {
        this.sizeInFeet = sizeInFeet;
    }

    public boolean isCanEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    //Methods

    @Override
    public String swim() {
        return super.swim();
    }

    public String dontEat(){
        if (canEat != true){
            return "You should not eat this fish! It is poisonous!";
        }else{
            return "This fish can be eaten!";
        }


    }

    //ToString

    @Override
    public String toString() {
        return "Fish{}";
    }
}
