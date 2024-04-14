import java.util.*;

public class oops {
   

    public static void main(String args[]) {
      Comp Ai = new Comp();  //creation of object of the derived class
      Ai.course();//calling a function from a base class using an object of derived class
    }
}

//creation of base class

class Engineer {
    void course() {
        System.out.println("course is taken");
    }
    void Study () {
        System.out.println("yes");
    }
}

//creation of derived class 

class Comp extends Engineer { //syntax to inherit a base class
    int lap;

    void Coding() {
        System.out.println("coding is reqd");
    }

}
