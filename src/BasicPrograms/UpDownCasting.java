package BasicPrograms;

class A{
    public void show1(){
        System.out.println("In A show");
    }
}
class B extends A{
    public char[] marks;

    public void show2(){
        System.out.println("In B show");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        A obj = (A) new B(); //UpCasting B-A //Parent reference & child object
        // A obj = new B(); implictly upcasting is done
        obj.show1();

        B obj1 = (B) obj; //DownCasting
        obj1.show2(); //obj of parent class to obj1 of child class A-B
    }
}
