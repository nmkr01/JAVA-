/*
    ==> If Else Statement Syntax
    
         if (condition)
        {
            -->Executes this block if
            -->condition is true
        }
        else
        {
            -->Executes this block if
            -->condition is false
        }
 */

package ConditionalStatements;

public class IfElseStatement {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;

        //if-else statement
        if(x>y) {                
            System.out.println(x);
            System.out.println("x is Bigger than y");
        }
        else
            System.out.println(y);
    }
}
