package DishWare;

import java.sql.SQLOutput;

public class Main{
    public static void main(String[] args){
        Dishes blueCup = new Dishes("Blue Cup", 5, "blue", "plastic", false, false);
        System.out.println(blueCup);
        System.out.println("\n");

        Dishes redCup = new Cups("Red Cup", 8, "red", "plastic", true, true, false, "parties");
        System.out.println(redCup);
    }
}
