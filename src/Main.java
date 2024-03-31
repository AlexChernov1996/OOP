
public class Main { // class Lab1
    public static void main(String[] args){
        Dog dog1 = new Dog("Spike", 30); // created an object dog1 instance of Dog class
        // call methods
        dog1.sleap();
        dog1.wakeUp();
        dog1.bark();
        dog1.run();
        dog1.setWeight(90);

        Dog dog2 = new Dog("Tom ", "black", 10);	//created an object dog2 instance of Dog class
        dog2.bark();
        dog2.wakeUp();

        Dog[]dogs= { //created an array dogs with objects instanced Dog
                new Dog("Spike ","black", 22 ),
                new Dog("Ale3x ","black", 68 ),
                new Dog("Illya ","black", 50 ),
                new Dog("Yulic ","black", 100 ),
                new Dog("Danya ","black", 82 ),
        };
        for(Dog dog: dogs){ // for each object in the array dogs
            if(!dog.getColor().equals("White")){
                System.out.println(dog.getName());
            }
        }
    }
}

