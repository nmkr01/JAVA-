/*
    ==> Do While Loop Syntax
         do
            {
                statements..
            }
            while (condition);
 */

package Loops;

public class DoWhile {
    public static void main(String[] args) {
        int i = 1;

        //DoWhile Loop - Atleast You will get the output once even the condition is false

        do{
            System.out.println("Hello " +i);
            i++;
        }while(i<=5);
    }
}
