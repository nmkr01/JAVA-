package Strings;

public class Strings {
    public static void main(String[] args) {
         // String name = new String("manoj"); Normal Syntax of String Creation

         String name = "manoj"; // regular syntax of string creation
         name = name + "kumar";
         System.out.println(name);
 
         //Mutable String - Change - To make string mutable we use String Buffer & String Builder
         //Immutable String - Unchange - By default strings are immutable
 
         String s1 = "Reddy";
         String s2 = "Reddy";  // Both s1 & s2 are same but the object is created at once and refers the same address to both
 
         System.out.println(s1==s2);
    }
}
