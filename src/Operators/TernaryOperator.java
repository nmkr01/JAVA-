package Operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int n = 6;
        int result = 0;

        //if(n%2==0)
          //  result = 10;
        //else
          //  result = 20;

        //?: Ternary Operator

        result = n%2==0 ? 10 : 20; //single line

        System.out.println(result);
    }
}
