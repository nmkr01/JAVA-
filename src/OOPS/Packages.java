package OOPS;

import java.util.Scanner;

public class Packages {
    public static void main(String[] args) {
         @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The UserName : ");

        String UserName = scanner.nextLine();
        System.out.println("UserName is : " + UserName);
    }
}

/* 
    User-defined Packages

    package OOPS;
    
    class Packages{

        public static void main(String [] args) {
            System.out.println("Hi There")
        }
    }

*/