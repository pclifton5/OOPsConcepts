package zoo;

<<<<<<< Updated upstream
=======
<<<<<<< Updated upstream
public class Duck {
=======
>>>>>>> Stashed changes
public class Duck extends Animal{
    //Fields
    private static final String BEAKCOLOR = "Yellow";

    //Constructors
    public Duck(int age, String gender, String name) {
        super(age, gender, name);
    }

    //Methods
<<<<<<< Updated upstream
    public String quack(){
        return "I am quacking!";
    }
    public String fly(){
        return "I am flying";
=======
    public static String quack(){
        return "This duck can quack!";
    }
    public static String fly(){
        return "This duck can fly!";
>>>>>>> Stashed changes
    }
    //Override Methods
    @Override
    public String swim() {
<<<<<<< Updated upstream
        return "I am swimming as a Duck!";
=======
        return "This duck can swim!";
>>>>>>> Stashed changes
    }

    //To String
    public String toString(){
<<<<<<< Updated upstream
        return "The Duck's name is "+ getName()+
                " Age: "+getAge()+
                " Beak color is: "+BEAKCOLOR;
    }
=======
        return "This Duck's name is "+ getName()+"!\n"+
                "Its "+getAge()+" years old!\n"+
                "Its beak color is "+BEAKCOLOR+"!";
    }
>>>>>>> Stashed changes
>>>>>>> Stashed changes
}
