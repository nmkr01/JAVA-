
//Final with Class - We cant extends the previous class to make changes when a class is final
//stops inheritance

package OOPS;
final class Calc
{
    public void show()
    {
        System.out.println("In Calc show");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

public class FinalWithClass {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(2, 5);
    }
}
