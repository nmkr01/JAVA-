
/*
    Interfaces
       => When you have a class which have only abstract methods, the other alternative is that creating a interfaces.
       => Instead of creating a abstract class we are creating a interface.
       => Most of the time we use interfaces in the project development.
       => Interface is not a class and by default every method in interface is public and abstract.
            * public abstract void run(); -> void run(); // we dont need to mention public and abstract it is there by default in it.
       => Interface provide the only methods we need and it will not implement them.
       => We can implement the interface methods by creating object of a class.
            * In terms of abstract class - class B extends A
            * In terms of interfaces - class B implements A
       => When ever you want to implement the interfaces you use implements keyword.
       => If you fail to implement a class it will become a abstract class.
       => We can create a variables inside the interfaces and by default they are final and static.
       => When the variables are static we can directly use the interface name with out objects.
       => We can implement multiple interfaces with one class , this does not work in abstract class - we can extend only one class.

            * class - class => extends
            * class - interface => implements
            * interface - interface => extends

    JAVA NOTES

    Types of Interfaces

        => Normal Interfaces - Interface with two or more methods is called Normal Interface
        => Functional Interfaces / Single Abstract Method (SAM) - Functional Interface is Interfacewhich has only one method. 
                                ==> Lambda Expressions only works with Functional Interfaces.
        => Marker Interfaces - Marker Interface is Interface which has no methodas.
                            => We can achieve the serilazation concept through this Marker Interface.

                            Serilazation - When objects are created inside the heap memory then the values stored in objects are loaded to Harddisk this concept is called Serilazation.
                            DeSerilazation - Loading back objects data into the heap memory from hard disk is called DeSerilazation.


                        
 */

 package OOPS;

 interface A{
    int age = 23;
    String area = "Hyderabad"; // By default variables are final and static
    char [] marks = null;

    void show();   // public abstract void show(); 
    void config();
 }
 interface X{
    void run();
 }
 
 interface Y extends X{
    
 }
 
 class B implements A,Y
 {
     public void show(){
         System.out.println("In show");
     }
     public void config(){
         System.out.println("In config");
     }
     public void run(){
         System.out.println("running");
     }
 }
 
public class Interfaces {
    public static void main(String[] args) {
        
        A obj;
        obj = new B();

        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();
    
        System.out.println(A.area); //since area is static we can directly use with interface A.area();
    }
}
