package DishWare;

import java.sql.SQLOutput;

public class Main{
      public static void main(String[] args){
        Dishes blueCup = new Dishes("Blue Cup", 5, "blue", "plastic", false, false);
        System.out.println(blueCup);
        System.out.println("\n");

        Dishes redCup = new Cups("Red Cup", 8, "red", "plastic", true, true, true, "parties");
        System.out.println(redCup);
        System.out.println("\n");

        Dishes greenBowl = new Bowls("Green Bowl", 4, "Green","plastic", false, true, true, "cereal");
        System.out.println(greenBowl);
        System.out.println("\n");

        Dishes whitePlate = new Plates("White Plate", 4, "White with blue flowers", "ceramic", false, false, true, true);
        System.out.println(whitePlate);
    }
}
