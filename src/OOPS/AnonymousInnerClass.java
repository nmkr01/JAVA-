package OOPS;

class A{
    public void show(){
        System.out.println("In A Show");
    }
}
// class B extends A{
//     public void show(){
//         System.out.println("In B Show");
//     }
// }

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("In new show"); //instead of overriding the show() method by extending a class simply we add a mehtod in this {};
            }
        }; //anonymous inner class def - {};
        obj.show();
    }
}
