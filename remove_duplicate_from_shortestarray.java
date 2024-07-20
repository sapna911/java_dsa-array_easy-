public class remove_duplicate_from_shortestarray{
    public static int array_removeelement(int nums[]){
        int j = 0;
        for(int i = 0;i<nums.length;i++){
         /*    if(nums[j]==nums[i]){
               i++;

         }*/
        if(nums[j]!=nums[i]){
            nums[++j]=nums[i];
        }
           
            
        }
        return (++j);
        //a[1,1,2,2,3] target = [1]
    }
    public static void main(String[] args) {
        int arr [] = {1,1,2};
        System.out.println(array_removeelement(arr));
    }
}