/*
         Logical Operators
         * && - Logical AND --> if any of them is false returns false 
         * || - Logical OR  --> if any of them is true returns true
         * ! - Logical NOT
*/

package Operators;

public class LogicalOperator {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;

        int x = 4;
        int y = 9;

        boolean result = a<b && x>y; //Logical AND
        System.out.println(result); // op = false

        int p = 1;
        int q = 3;

        int r = 4;
        int s = 9;

        boolean result1 = p>q || r>s; //Logical OR
        System.out.println(result1); // op = false 


        int num1 = 5;
        int num2 = 3;

        boolean res = num1>num2; 
        System.out.println(!res); //Logical Not // op = false
    }
}
