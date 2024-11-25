/*
    Wrapper Classes
        * int -> Integer
        * char -> Character
        * double -> Double
    For every Primitive type(int,float,char) we have a class for it.
 */

package BasicPrograms;

public class WrapperClass {
    public static void main(String[] args) {
        int num = 7;
        Integer num1 = num; //autoBoxing - directly assign a primitive value to object type

        int num2 = num1; //auto-unboxing - fetch the value automatically
        System.out.println(num2);

        String str = "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);

     /*  
        int num = 7;
        Integer num1 = new Integer(num); //Boxing

        int num = 7;
        Integer num1 = num; //AutoBoxing
    */ 

    }
}
