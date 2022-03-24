package zoo;

public class Main {
    public static void main(String[] args){

        //Inheritance
        Animal duck = new Animal(50,"Flapper","Donald");
       // System.out.println(donald.swim());
        System.out.println(duck);

        Animal bear= new Animal();
        bear.setName("Bear");
        bear.setAge(5);

        System.out.println(bear.getAge("Everett"));

        System.out.println("\n\n");
        //Inheritance
        //Fish 1
        Fish fish1 = new Fish();
        fish1.setAge(2);
        fish1.setName("Donald");
        System.out.println(fish1.getName());
        //Fish 2
        Fish fish2 = new Fish(25, true);
        fish2.setName("Micky");
        System.out.println(fish2);
        //Fish 3
        Fish fish3 = new Fish(3, "male", "Flapper",3, false);
        System.out.println(fish3);
        //Fish 4
        Animal fish4 = new Fish(4,"Female", "Flappy", 12, false);
    }
}
