import java.util.*;
public class ArrayTwoIndexSum {
    public int[] twoSum(int nums[], int target){
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        ArrayTwoIndexSum obj = new ArrayTwoIndexSum();
        int nums[] = {2,3,6,8};
        int target = 10;
        int result[] = obj.twoSum(nums, target);
        if(result!=null){
            System.out.print(Arrays.toString(result));
        }
        else
            System.out.print("Not found");
    }
}
