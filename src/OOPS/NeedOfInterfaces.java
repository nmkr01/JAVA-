
//Instead of using abstract classes we are using interfaces to simplify code
package OOPS;

interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code,compile,run : faster");
    }
}

class Developer
{
    public void devapp(Computer lap)
    {
        lap.code(); 
    }
}
public class NeedOfInterfaces {
    public static void main(String[] args) {
        Computer lap = new Laptop(); // Here we use reference of interfaces and objects of classes
        @SuppressWarnings("unused")
        Computer desk = new Desktop();

        Developer john = new Developer();
        john.devapp(lap);
    }
}
