
// ==> From Java 8 Features, We can use Lambda Expressions only when functional interfaces. 

package OOPS;

@FunctionalInterface
interface A{
    void show(int i);
}
public class FuncInterfaceWithLambdaExpression {
    public static void main(String[] args) {
        A obj = (i) -> System.out.println("In Show : "  +  i);
        // ( -> ) Lambda Expression ==> Here By typing -> , it will automatically add new A() and show() behind the scene.
        obj.show(5);
    }
}


