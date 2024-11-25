package OOPS;
class A{
    public char[] marks;
    public A(){
        System.out.println("Object Created");
    }
    public void show(){
        System.out.println("In A show");
    }
}

public class ObjectCreation {
    public static void main(String[] args) {
        new A().show(); // By using new we create object
        //new A();// - Anoynomous Object
    }
}
