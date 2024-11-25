package Arrays;

public class Arrays {
    public static void main(String[] args) {
         // int nums[] = {3,1,8,4};
        // System.out.println(nums[3]); // Type 1

        int nums[] = new int[4]; // Type 2

        nums[0] = 4;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 9;

        for(int i=0;i<=3;i++){
            System.out.println(nums[i]);
        }
    }
}
