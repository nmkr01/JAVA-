
/*
    Abstract
        -> Abstract method only belongs to abstract class.
        -> If you have any abstract methods you should makes a class abstract as well.
        -> we cant create a object of abstract class.
        -> abstract class can have a normal methods too.
        -> we can create a multiple abstract methods in abstract class.
        -> If you have the abstract class there is no compulsion that the abstract class should have the abstract methods.  
        -> we can create a object of concrete class not an abstract class.
 */

package OOPS;
abstract class Car{
    public abstract void drive();
    public abstract void fly(); //multiple abstract methods

    public void playMusic(){
        System.out.println("play music");
    }
}

abstract class Xuv700 extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}

class UpdatedXuv700 extends Xuv700 // concrete class
{
    public void fly(){
        System.out.println("Flying");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car obj = new UpdatedXuv700(); //DynamicMethodDispatch
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
