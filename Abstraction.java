import java.util.*;

public class oops {
   

    public static void main(String args[]) {
     Human h = new Human();
     h.sit();
     h.walk();
      
    }
}

//abstract classes are classes to which we cant create objects.
//abstract methods r thos that doesnt require implementation.that means a class will have a function but it wont have a implementation.
//the sub classes of the class will knw the implementation of the abstract class.
//the sub class must implement the abstract method of the main classs

abstract class Animal {
    void eat() {
        System.out.println("eats");
    }
    abstract void walk ();
}
//simillarl every class that inherits the base class if it has a abstract method then every derivd class must havve a implementationo the abstract function

class Human extends Animal {
    void sit () {
        System.out.println("sits");
    }
    void walk() {
        System.out.println("on 2 feeet");
    }
}


