package zoo;

public class Animal {
    //Fields
    private int age;
    private String gender;
    private String name;

    //Method Overloading - Different parameters and return type
    //Method Overriding - Same method signature return dynamic

    //Constructors

    public Animal() {
    }

    //Parameterized Constructors
    public Animal(int age, String gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    //Getters and Setters
    public int getAge() {
        return age;
    }
    public String getAge(String name) {
        return "Your name is: "+name+" and your age is: "+getAge();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods
    public boolean isMammal(){
        return true;
    }
    public String swim(){
        return "I can swim";
    }
    public String run(){
        return "I can run";
    }

    //To String
    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
