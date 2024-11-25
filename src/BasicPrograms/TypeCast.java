//Type Casting
    /**
  Type Casting = explict Conversion
  Type Conversion = implict Conversion
 */

package BasicPrograms;

public class TypeCast {
    public static void main(String[] args) {
        int i = 12;
        byte k = (byte) i;
    
        System.out.println(k);
    
        float f = 5.6f;
        int t = (int) f;
    
        System.out.println(t);
    
        //Type Promotion
    
        byte a = 10;
        byte b = 30;
    
        int result = a*b; // 300 is out of range & stores in result of int type
    
        System.out.println(result);
    }
}
