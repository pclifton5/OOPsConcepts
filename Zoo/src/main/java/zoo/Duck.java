package zoo;

import interfaces.Speak;

public class Duck {
    public class Duck extends Animal implements Speak {
        //Fields
        private static final String BEAKCOLOR = "Yellow";
        private int numLegs;

        //Constructors
        public Duck(int age, String gender, String name) {
            super(age, gender, name);
        }

        //Methods

        public String fly() {
            return "I am flying";
        public static String quack () {
                return "This duck can quack!";
            }
            public static String fly () {
                return "This duck can fly!";
            }
            //Override Methods
            @Override
            public String swim () {
                return "I am swimming as a Duck!";
                return "This duck can swim!";
            }

            //To String
            public String toString () {
                return "The Duck's name is " + getName() +
                        " Age: " + getAge() +
                        " Beak color is: " + BEAKCOLOR;
            }
            return "This Duck's name is " + getName() + "!\n" +
                    "Its " + getAge() + " years old!\n" +
                    "Its beak color is " + BEAKCOLOR + "!";
        }
    }
}
