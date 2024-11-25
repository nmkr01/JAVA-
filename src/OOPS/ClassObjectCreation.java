/*
    ==> To create a class, use the keyword class.
    ==> In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.
    ==> To create an object of Main, specify the class name, followed by the object name, and use the keyword new.
    ==> We can create multiple classes and objects.
 */

// Here class name is ClassObjectcreation

package OOPS;

public class ClassObjectCreation {
    int x = 5;
    public static void main(String[] args) {
        ClassObjectCreation obj = new ClassObjectCreation(); // obj is a object, by 'new' we create objects
        System.out.println(obj.x);
    }
}
