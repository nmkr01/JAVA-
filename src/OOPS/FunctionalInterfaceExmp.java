/*
    Functional Interface - The Interface which has only one method is called Functional Interface.
    ==> We use @Functionalinterface annotation to indicate it as functional interface.
    ==> From Java 8 Features, We can use Lambda Expressions only with functional interfaces. 
 */
package OOPS;

@FunctionalInterface
interface A
{
   public abstract void show(int i);
} //Functional Interface

// class B implements A{
//     public void show(){
//         System.out.println("In show");
//     }
// }
public class FunctionalInterfaceExmp {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show(int i)
            {
                System.out.println("In show : " + i);
            }
        }; //Anoynomous Inner Class

        obj.show(5);
    }
}
