package OOPS;

class A{
    int age;
    public void show(){
        System.out.println("In Show");
    }

    class B{    //InnerClass
        public void config(){
            System.out.println("In Condig");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B(); //Accessing inner class method
       // A.B obj1 = new A.B(); // If we make inner class as static
        obj1.config();
    }
}
