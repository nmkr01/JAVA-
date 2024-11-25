/*
    Encapusulation
        --> Binding the data and the code that works on that together in a single unit.
        --> Encapsulation allows data-hiding as the data specified in one class is hidden from other class.
         
    The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must
        * Declare class variables/attributes as private.
        * Provide public get and set methods to access and update the value of a private variable.
        * Private Variables are not accessed outside the class, to access them we use public getters and setters methods. 
 */

package OOPS;
class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
}

public class Encapsulation {
    public static void main(String[] args) {
        Human Obj = new Human();
        Obj.setAge(23);
        Obj.setName("Mark");
        System.out.println(Obj.getName() + " : " + Obj.getAge());
    }
}
