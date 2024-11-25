package BasicPrograms;

public class PrePostIncrement {
    public static void main(String[] args) {
        int num1 = 5;
        //num1++;  //PostIncrement
        //++num1;   //PreIncrement
        System.out.println(num1);

        int result2 = ++num1; // first increment and then fetch the value
        System.out.println(result2);

        int result3 = num1++; // fetch the value first and then increment
        System.out.println(result3);
    }
}
