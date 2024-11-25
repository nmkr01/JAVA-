/*
    ==> Switch-Case Statement Syntax
        switch (expression)
        {
        case value1:
            statement1;
            break;
        case value2:
            statement2;
            break;
        .
        .
        case valueN:
            statementN;
            break;
        default:
            statementDefault;
        }
 */

package ConditionalStatements;

public class SwitchStatement {
    public static void main(String[] args) {
        int n = 5;

        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid  number");
        }
    }
}
