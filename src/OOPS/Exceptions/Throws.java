/*
    Throws keyword is used in method declarations to specify that the method can throw one or more exceptions.
    ==> It's used to signal that a method may encountere exceptional conditions that it cant handle.
    ==> Checked Exceptions can only be done.
 */

package OOPS.Exceptions;

class A{
    public void show() throws ClassNotFoundException 
    {
        Class.forName("Throw");
    }
}

public class Throws {
    static {
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
