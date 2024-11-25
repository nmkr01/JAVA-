
/*
    Inheritance - Aquiring the properties from parent class to child class.
        Parent class - Car
                |
        Child class -  Range Rover 
        ==> Here Range Rover is a Child class to Parent class Car.
        ==> We call
                * Parent Class - Child Class
                * Super Class - Sub Class
                * Base Class - Derived Class
            --> Super Class - A Super Class is a class that acts a parent to some other class or classes.
            --> Sub Class - A Sub Class is a class that inherits from another class.   
        ==> We use the 'extends' to inherit the properties from super class to child class.
    Types Of Inheritance
        * Single Inheritance
        * Multiple Inheritance
        * Multilevel Inheritance
        * Hierarchial Inheritance
        * Hybrid Inheritance
    ==> MultiLevel Inheritance is not supported in Java. Reason is ambiguity problems.
 */

 package OOPS;

//Single level Inheritance
class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}

class AdvCalc extends Calc
{
    public int mul(int n1,int n2)
    {
        return n1*n2;
    }
    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}

//Multi Level Inheritance
class VeryAdvCalc extends AdvCalc
{
    public int power(int n1,int n2)
    {
        return (int) Math.pow(n1,n2);
    }
}
public class Inheritance {
    public static void main(String[] args) {
         VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(2, 8);
        int r2 = obj.sub(5, 3);
        int r3 = obj.mul(3, 6);
        int r4 = obj.div(4, 2);
        int r5 = obj.power(3, 2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
