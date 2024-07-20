public class search_index_position_inarray{
    public static int Binary_search(int nums[] , int key){
        int start = 0;
        int end = nums.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==key){
                return mid;
            }
            else if(nums[mid]>key){
                end =mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;


    }
    public static void main(String[] args){
        int arr[] = {1,3,5,6};
        int key = 5;
        System.out.println("THE POSITION OF THE ELEMENT IS:" + Binary_search(arr, key));
    }

}