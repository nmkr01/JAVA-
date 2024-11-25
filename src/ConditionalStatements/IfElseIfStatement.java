/*
    ==> If Else If Statement Systax

        if (condition)
            statement;
        else if (condition)
            statement;
        .
        . 
        else
            statement;
 */

package ConditionalStatements;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int i = 5;
 
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
    }
}
