package OOPS.Exceptions;

class ManojException extends RuntimeException{
    public ManojException(String string){
        super(string);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18/i;
            if(j==0)
                throw new ManojException("I dont want to print zero ");
        } 
        catch (ManojException e) {
            j = 18/1;
            System.out.println("Thats the default output " + e);
        }
        catch(Exception e) {
            System.out.println("Something went wrong ");
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}
