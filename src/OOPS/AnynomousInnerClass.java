
/*
    If you want to implement the interface of abstract class only once then we use anoynomous inner class.
 */

package OOPS;
abstract class A
{
    public abstract void show();
    public abstract void config();
}
// class B extends A
// {
//     public void show()
//     {
//         System.out.println("In B show");
//     }
// }

public class AnynomousInnerClass {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In new Show");
            } //anynomous inner class
            public void config() 
            {
                System.out.println("In config");
            }  
        };
        obj.show();
    }
}
