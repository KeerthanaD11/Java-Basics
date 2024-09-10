public class ArraySearchIndexPos {
    public int searchInsert(int nums[], int target){
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args){
        ArraySearchIndexPos obj = new ArraySearchIndexPos();
        int nums[] = {2,4,5,6,7};
        int target = 3;
        System.out.print("Present at the index: " + obj.searchInsert(nums, target));
    }
}
