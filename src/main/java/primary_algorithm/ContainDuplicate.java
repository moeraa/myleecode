package primary_algorithm;

import java.util.HashSet;

/**
 * @Auther: moer
 * @Date: 2019/4/9 21:22
 * @Description:
 */
public class ContainDuplicate {
    public boolean containsDuplicateMy(int [] nums){
        boolean result = false;
        for ( int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;i++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return result;
    }
    public boolean containsDuplicateMy1(int [] nums){
        boolean result = false;
        HashSet<Integer> numSet = new HashSet(nums.length);
        numSet.add(nums[1]);
        for (int i =1 ;i<nums.length;i++){
            if (numSet.contains(nums[i])){
                result = true;
            }else {
                numSet.add(nums[i]);
                result = false;
            }
        }
        return result;
    }




    public static void main(String[] args) {
        ContainDuplicate containDuplicate = new ContainDuplicate();
        int[] nums = {33, 444, 77,8, 9, 44};
//        System.out.println(soluction.removeDuplicates(nums));
//        System.out.println(soluction.removeDuplicates(nums));
//        System.out.println(Arrays.toString(soluction.moveArrayElement1(nums,2)));
//        System.out.println(soluction.containsDuplicate1(nums));
//        System.out.println((soluction.quickSort(nums,0,nums.length-1)));
        System.out.println(containDuplicate.containsDuplicateMy1(nums));

    }
}
