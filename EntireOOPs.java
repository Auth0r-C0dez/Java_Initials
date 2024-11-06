import bank;
import java.util.*;
class Pen {
    String color;
    String type;
    String quality;int year;

    public void write() {
        System.out.println(this.color);
    }
    public void details(int amount) {
        System.out.println(this.color + " and " + this.type + " costs " + amount );
        //System.out.println("its quality is " + this.quality + " and was build on " + this.year);
    }
    // Pen(int worth, String quality,int year) {
    //     System.out.println("we are working on the details of pen and its characteristics worth " + worth);
    //     this.quality =quality;
    //     this.year=year;
    // }
    // Pen(Pen p2) {
    //     this.color = p2.color;
    //     this.type = p2.type;
    // }
    // Pen() {

    // }
    //cODEDS For function over loading
    public void info(String name) {
        System.out.println("the name is " + name);
    }
    public void info(int year){
        System.out.println("the year is " + year);
    }
    public void info(String name,int year) {
        System.out.println("the name is " + name + " was made in " + year);
    }

}

//inhertitance 
class Shape {
    public void area () {
        System.out.println("area is toi be  printed");
    }
}
class triangle extends Shape {
    triangle() {
    System.out.println("i am from eq traingle"); }
}


public class OOPS {
    public static void main(String args[]) {
        //Pen p1 = new Pen();
        // p1.color = "blue";
        // p1.type = "gel";
        // p1.write();
        // p1.details(10);
        // Pen p2 = new Pen(p1);
        // p2.write();
        // p2.details(30);
       // p1.info("smart gel",2024);
    //    triangle eq = new triangle();
    //    eq.area();
       bank.Account account1 = new bank.Account();
       account1.name="customer1";
    }
}
//The concept of abstract is to be used just as an idea and not actually use of implement it.in abstract class we can make some properties as well as
//as some properties as abstract.if a constructor is created in the abstrsact class as well as the main clas then on creation of the object of derived 
/*the constructor of the base class also gets called.this process is callled constructor chaining.*/
/*interfaces  are just like classes but they can be used for multiple inheritence.interfaces doesnt have constructors.interfaces cant be extended they
must be implemented into another calss.*/
/* if the keyword static is assigned to any function or to any method it means that specific attribute will be constant for as many number of times 
it will be used hence we use the term static in the main function because it is same in the entire function.*/
