
/*
    ==> same object - obj.show() behaving differently with different objects
    ==> Which method will called we are not sure, so this is called dynamic method dispatch 
    ==> This will only work when will have inheritance
    ==> Only we have child objects for the parent variable 
 */

 package OOPS;
 class A 
 {
     public void show()
     {
         System.out.println("In A show");
     }
 }
 class B extends A
 {
     public void show()
     {
         System.out.println("In B show");
     }
 }
 class C extends A
 {
     public void show()
     {
         System.out.println("In C show");
     }
 }
 
public class DynamicMethodDispatch {
    public static void main(String[] args) {
          // A obj = new B(); //Reference of A and object of B
       // obj.show();

       A obj = new A();
       obj.show();

       obj = new B();
       obj.show();

       obj = new C();
       obj.show();
    }
}
