//Developer Comments
/*
 * This is where you would put your comments.
 * */

//Package
package zoo;

//Imports
import interfaces.Speak;
import interfaces.communication;

//TODO Discuss: Talk about using TODOS

//Class Declaration
public class Animal {
    //Fields
    private int age;
    private String gender;
    private String name;

    //TODO Comments: Remove
    //Method Overloading - Different parameters and return type
    //Method Overriding - Same method signature different body

    //Constructors
    public Animal() {
    }
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
        return "Your name is: " + name + " And your age is: " + getAge();
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
    public boolean isMammal() {
        return true;
    }
    public String swim() {
        return "I am swimming in Super which is the Animal class...";
    }
    public String run() {
        return "I am running man hear me roar!!!";
    }

    //TODO Remove: We will be using inheritance so we will not need this.

}