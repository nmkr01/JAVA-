/* 
    This - Super methods
    super() means calls the constructor of a super class
    if you wants to pass a parameterized constructor then you have to pass explictly super()
    every constructor has by deafualt a method is there that is super()
    every class extends a object class
    this() - executes the constructor of the same class
    super() - executes the constructor of super class
 */

package OOPS;

class A extends Object
{
   public char[] marks;
   public A()
   {
       super();
       System.out.println("In A");
   }
   public A(int n)
   {
       System.out.println("In A int");
   }
}

class B extends A
{
   public B()
   {
       super();
       System.out.println("In B");
   }
   public B(int n)
   {
       this();
       System.out.println("in B int");
   }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        
        @SuppressWarnings("unused")
        B obj = new B(5);
    }
}
