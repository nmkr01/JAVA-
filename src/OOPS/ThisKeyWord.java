// if both local & instance variables are to be same we use This keyword
// this - this is a keyword which represents the current object.

package OOPS;
  
class Human{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age; // this represents the current object age
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class ThisKeyWord {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(23);
        obj.setName("Manoj");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}