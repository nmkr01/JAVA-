package OOPS;
class Vehicle{
    public void SpeedOfCar(){
        System.out.println("Car is Moving Fast");
    }
}
class Car extends Vehicle{
    public void SpeedOfCar(){
        System.out.println("Car is Moving Slow");
    }
}

public class MethodOverRiding {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.SpeedOfCar();
        System.out.println(obj);
    }
}
