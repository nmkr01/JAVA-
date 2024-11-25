package Loops;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int i = 1; 

        //OuterLoop
        while (i<=4) {
            System.out.println("hi " +i);

            int j = 1;
            //Nested WhileLoop - InnerLoop

            while (j<=3) {
                System.out.println("Bye " +j);
                j++;
            }
            i++;
        }
    }
}
