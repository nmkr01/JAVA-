
/*
    Enumeration ==> shortly we call enums
    ==> Enums are named constants
    ==> Enums are prebuilt.
    ==> Enum is a class.
    ==> We cant extend enums with other classes.
    ==> When you have a specific error codes to create a constants, instead of creating a objects we use enums.
 */
//Here Status is a class and all inside the status class are objects.
// We are using named constants.

package OOPS;
enum Status{
    Running, Failed, Pending, Success;
}
public class Enums {
    public static void main(String[] args) {
        // Status s = Status.Success;
        // System.out.println(s);
        // System.out.println(s.ordinal()); // Indicates the status number
        
        // To Print all the status at one time
        Status[] ss = Status.values();

        for (Status status : ss) {
            System.out.println(status + " : " + status.ordinal());
        }
    }
}
