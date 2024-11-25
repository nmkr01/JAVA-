
/*
    ==> Class attributes are variables within a class.
    ==> You can access attributes by creating an object of the class, and by using the dot syntax (.).
    ==> We can create multiple attributes and objects in a class.
 */
package OOPS;
public class ClassAttributes {
    int age; // age is attribute or simply we call variable
    public static void main(String[] args) {
        ClassAttributes MyObj = new ClassAttributes();
        MyObj.age = 23;

        System.out.println("Age : " + MyObj.age);
    }
}
