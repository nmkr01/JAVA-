
/*
    ==> Every class in java extends the Object Class.
    ==> Even if we dont mention it is there.
 */
package OOPS;

class Laptop {

     String model;
     int price;
 
     public String toString() {
         return model + " : " + price;
     }
 
     public boolean equals(Laptop that) {
         return this.model.equals(that.model) && this.price == that.price;
     }
 }
public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Hp 14s";
        obj1.price = 45000;

        Laptop obj2 = new Laptop();
        obj2.model = "Hp 14s";
        obj2.price = 45000;

        boolean result = obj1.equals(obj2);
        System.out.println(result);
    }
}
