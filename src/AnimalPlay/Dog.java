package AnimalPlay;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        toFly= new CantFly();
    }

}
