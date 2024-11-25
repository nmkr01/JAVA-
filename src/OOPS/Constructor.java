/*
    Constructors - A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.
        ==> Constructor - constructor is a special method.
        ==> It has a same name as class name.
        ==> Constructor newer returns anything.
        ==> Everytime you create a new object it will create a constructor.
        ==> We can assign a default values in constructor.
        ==> All Classes hava constructors by default.
        Types Of Constructors
            * Default Constructors
            * Parameterized Constructors
 */

package OOPS;
class Human{
    private int age;
    private String name;
    
    public Human() {
        age = 12;
        name = "bob";
    }

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

public class Constructor {
    public static void main(String[] args) {
        Human obj = new Human();
        // System.out.println(obj.getName() + " : " + obj.getAge());
        
        // obj.setAge(23);
        // obj.setName("manoj");
        System.out.println(obj.getName() + " : " + obj.getAge()); //by default values
    }
}
