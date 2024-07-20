import java.util.Arrays;

public class twosum{
    public static int[] array_twosum(int nums[],int target){
        for(int i =0; i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int a[] = {i,j};
                    return a;
                }
            }
        }
        return nums;

               
    }
    public static void main(String arg[]){
        int arr[] = {1,3,5,7,9};
        int target = 10;
        System.out.println(Arrays.toString(array_twosum(arr, target)));
    }
}