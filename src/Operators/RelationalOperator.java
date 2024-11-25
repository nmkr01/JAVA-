package Operators;

public class RelationalOperator {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        boolean result = x > y; // > operator
        System.out.println(result); //op = true

        int a = 8;
        int b = 2;
        boolean res = a < b; // < operator
        System.out.println(res); //op = false

        int p = 5;
        int q = 5;
        boolean result1 = p == q; // == operator
        System.out.println(result1); //op = true

        int m = 5;
        int n = 3;
        boolean sol = m!=n; // != operator
        System.out.println(sol); //op = true

        int c = 5;
        int d = 3;
        boolean results = c>=d; // >= operator
        System.out.println(results); //op = true

        double xy = 5.8;
        double yz = 8.9;
        boolean result3 = xy<=yz; // <= operator
        System.out.println(result3); //op = true
    }
}
