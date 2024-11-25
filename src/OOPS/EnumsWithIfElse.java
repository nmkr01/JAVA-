package OOPS;
enum Status{
    Running, Failed, Pending, Success
}
public class EnumsWithIfElse {
    public static void main(String[] args) {
        Status s = Status.Failed;

        if(s == Status.Running)
            System.out.println("All Good");
        else if(s == Status.Failed)
            System.out.println("Try Again");
        else if(s == Status.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");
    }
}
