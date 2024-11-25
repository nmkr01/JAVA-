/*
    ==> Handling Exceptions <==
        *Try-Catch Block
            ==> Try - Try will basically try to execute the statements, if everything was good it will execute the remaining statements.
            ==> Catch - If there is any exception then catch block will be executed otherwise it does not executed.
            ==> There are multiple catch blocks followed by try block
            ==> Exception is a parent class, it can handle all the exceptions.
 */

package OOPS.Exceptions;

public class HandlingExceptions {
    public static void main(String[] args) {
        int i = 2;
        int j = 0;
        String str = null;

        int nums[] = new int[5];

        try {
            j = 18/i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot Divivd By Zero");
        } // Handling Exceptions with try-catch block !!

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Limit is Exceeded");
        }

        catch(Exception e){  
            System.out.println("Something Went Wrong !! " + e);
        } // Parent Exception - handles all exceptions

        System.out.println(j);
        System.out.println("Bye");
    }
}
