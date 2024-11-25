package OOPS;

class Calculator{
    public int Add(int n1,int n2,int n3){
        int result = n1+n2+n3;
        return result;
    }
    public int Add(int n1,int n2){
        return n1+n2;
    }
}

public class Methods2 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int r1 = calc.Add(2, 5, 9);
        int r2 = calc.Add(3, 5);
        System.out.println("Sum of Three Numbers is : " + r1);
        System.out.println("Sum of Two Numbers is : " + r2);
    }
}
