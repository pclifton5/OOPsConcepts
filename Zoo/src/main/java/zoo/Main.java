package zoo;

public class Main {
    public static void main(String[] args){
//        Animal bear = new Animal();
//        bear.setName("Bear");
//        bear.setAge(5);
//        System.out.println(bear.getAge());
//        System.out.println(bear.getAge("Everett"));
//        System.out.println("\n\n");

        //Inheritance
        Animal duck = new Duck(50, "Flapper", "Donald");
       // System.out.println(donald.swim());
        System.out.println(duck);

        bear.setName("Bear");
        bear.setAge(5);

        System.out.println(bear.getAge("Everett"));

        System.out.println("\n\n");
        //Inheritance
        Animal duck = new Duck(50, "Flapper", "Donald");
        System.out.println(duck);
        System.out.println(duck.swim());
        System.out.println(Duck.fly());
        System.out.println(Duck.quack());
        Animal clownFish = new Fish(4, "Flapper","Nemo");
        System.out.println(clownFish);
        System.out.println(clownFish.swim());
    }
}
