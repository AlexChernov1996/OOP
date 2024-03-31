public class Dog { // created class Dog
    // created fields
    private String name;
    private String color;
    private int weight;

    private boolean isSleaping = false; //default value is false
    public Dog(String name ){ // constructor 1
        this.name=name ;
    }
    public Dog(String name, String color ){ //constructor 2
        this(name);
        this.color = color;
    }
    public Dog(String name, int weight ){ //constructor 3
        this(name);
        this.weight= weight;
    }
    public Dog(String name,String color, int weight ){ //constructor 4
        this (name, color);
        this.weight = weight;
    }
    //methods
    public void wakeUp() {
        if (!isSleaping){
            System.out.println("Dog" + name + "woke up" );
            isSleaping = false;
        }else {
            System.out.println("Dog "+ name +" has already woken up");
        }
    }
    public void sleap(){
        if (!isSleaping){
            System.out.println("Dog " + name + " fall asleap");
            isSleaping = true;
        }else {
            System.out.println("Dog "+ name +" is already sleaping");
        }

    }
    public void bark (){
        if (isSleaping){
            if(weight >20){
                System.out.println("Dog " + name + " says 'BARK !'");
            }else {
                System.out.println("Dog "+ name +" says 'av av!'");
            }
        }else {
            System.out.println("Dog " + name + " can't bark. It's sleaping");
        }
    }

    public void run(){
        if(!isSleaping){
            if (weight >20){
                System.out.println("Dog " + name + " is running, but slowly");
            }else{
                System.out.println("Dog " + name + " is running very fast");
            }
        }else {
            System.out.println("Dog " + name + " cant'run. It's sleaping");
        }
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return this.color;
    }
}









