public class remove_wanted_element_in_array{
    public static int array_remove_element(int nums[],int val){
        int count=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=val){
               nums[count] =nums[i];
               count++;
            }
        }
        return count;

    }
    public static void main(String[] args){
        int arr[] = {3,2,2,3};
        int del=3;
        System.out.println(array_remove_element(arr, del));
    }
}