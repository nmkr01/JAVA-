/*
    ==> While Loop Syntax

     while (boolean condition)
        {
        loop statements...
        }
 */

package Loops;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;//Initialization
        
        //WhileLoop - use for database & files
        while(i<=5)//Condition
        {
            System.out.println("Hi , How are you !!" +i);
            i++;//Increment
        }
    }
}
