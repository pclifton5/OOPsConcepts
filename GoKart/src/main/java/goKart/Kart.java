package goKart;

public class Kart {
    //Fields
    private String name;
    private boolean needGas;
    private String color;
    private int laps;

    //Constructor
    public Kart() {
    }

    //Parameterized Constructor
    public Kart(String name, boolean needGas, String color, int laps) {
        this.name = name;
        this.needGas = needGas;
        this.color = color;
        this.laps = laps;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedGas() {
        return needGas;
    }

    public void setNeedGas(boolean needGas) {
        this.needGas = needGas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLaps() {
        return laps;
    }

    public void setLaps(int laps) {
        this.laps = laps;
    }
<<<<<<< Updated upstream

=======
    //Methods
    public String gasFillUp(){
        if (needGas==true){
            return "needs fuel!";
        }else{
            return "is fueled up and ready to go!";
        }
    }
    //ToString

    @Override
    public String toString() {
        return "This kart's name is: " + name + "\n" +
                "The gas tank is: " + gasFillUp() + "\n" +
                "Its colors are: " + color + "\n" +
                "And its ready for: " + laps + " laps before maintenance!";
    }
>>>>>>> Stashed changes
}
