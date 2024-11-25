/*
    Private - Accessed in the same class irrespective of Package
    Public - Accessed from anywhere
    Protected - works in the same class & package but can be used in sub class of other package
    Default - Accessed in the same package
*/

package OOPS;

public class AccessModifiers {
    public static void main(String[] args) {
        A obj = new A();
         System.out.println(obj.marks);

         B obj1 = new B();
         System.out.println(obj1.marks);
    }
}
