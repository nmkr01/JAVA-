// Final with Method 
// When you make your method with final no one can override it - stops overriding

package OOPS;
class Calc
{
    public final void show() // show method in subclass cant override in superclass show method
    {
        System.out.println("By Manoj");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

// class AdvCalc extends Calc
// {
//     public void show()
//     {
//         System.out.println("By shiva");
//     }
// }

public class FinalWithMethod {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.show();
        obj.add(3, 5);
    }
}
