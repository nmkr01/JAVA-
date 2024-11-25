
/*
    Method overloading - Allows a class to define multiple methods with the same name but different parameters.
        ==> Two or more methods having the same name but different parameters.
        ==> Resolved during Run-time.
 */

 package OOPS;

 class Human{
 
     private int age;
     private String name;
 
     //Default constructor
     public Human(){
         age = 12;
         name = "Bob";
     }
     
     //Parameterized constructor
     public Human(int age, String name) {
         this.age = age;
         this.name = name;
     }
 
     public int getAge() {
         return age;
     }
 
     public void setAge(int age) {
         this.age = age;
     }
 
     public String getName() {
         return name;
     }
 
     public void setName(String name) {
         this.name = name;
     }
     
     
 }
public class MethodOverLoading {
    public static void main(String[] args) {
        Human obj = new Human();
        Human obj1 = new Human(18,"manoj");

        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
