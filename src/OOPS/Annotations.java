package OOPS;
class A
{
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In A show");
    }
}

class B{
    @Override//Annotations
    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("In B class");
    }
}

public class Annotations {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
    }
}
