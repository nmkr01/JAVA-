/*
    Throw keyword is used to throw the exception, and then catch block will catch the exception 
 */

package OOPS.Exceptions;

public class Throw {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j==0)
                throw new ArithmeticException();
        } 
        catch (ArithmeticException e) {
            j = 18/1;
            System.out.println("Thats the default output");
        } 
        catch (Exception e) {
            System.out.println("Something Went Wrong" + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
