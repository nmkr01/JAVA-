/*
     if (condition1) 
    {
            Executes when condition1 is true
        if (condition2) 
        {
            Executes when condition2 is true
        }
    }
 */

package ConditionalStatements;

public class NestedIfStatement {
    public static void main(String[] args) {
        int i = 6;
 
        if (i == 10 || i<15) {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
 
            // Nested - if statement
            // Will only be executed if statement above
            // it is true

            if (i < 12)
                System.out.println("i is smaller than 12 too");
        } 
        else {
            System.out.println("i is greater than 15");
        }
    }
}
