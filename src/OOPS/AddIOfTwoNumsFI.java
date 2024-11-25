package OOPS;

@FunctionalInterface
interface A{
    int add(int i, int j);
}

public class AddIOfTwoNumsFI {
    public static void main(String[] args) {
        A obj = (i,j) -> i+j; // code is simplified
        // A obj = (int i, int j) ->
        // {
        //     return i+j;
        // };
        int result = obj.add(4, 3);
        System.out.println(result);
    }
}
