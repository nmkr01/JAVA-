
/*
    Methods - methods are declared within a class, and that they are used to perform certain actions.
    Types of Methods
        * Static -  Static method, which means that it can be accessed without creating an object of the class.
        * Public - public, which can only be accessed by objects.
 */
package OOPS;

class Computer{
    public void PlayMusic(){   // Method - playMusic
        System.out.println("Playing Music .. !!");
    }

    public String GetMePen(int cost){  // Method - GetMePen
        if(cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}
public class Methods {
    public static void main(String[] args) {
        Computer MyComp = new Computer();
        MyComp.PlayMusic();
        String str = MyComp.GetMePen(15);
        System.out.println(str);
    }
}
