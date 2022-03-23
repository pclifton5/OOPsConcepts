package zoo;

public class Main {
    public static void main(String[] args){
        Animal bear = new Animal();

        bear.setName("Bear");
        bear.setAge(5);

        System.out.println(bear.getAge());

        System.out.println(bear.getAge("Everett"));

        System.out.println("\n\n");
    }
}
