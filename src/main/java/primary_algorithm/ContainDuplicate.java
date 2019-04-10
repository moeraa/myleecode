package primary_algorithm;

import java.util.HashSet;

/**
 * @Auther: moer
 * @Date: 2019/4/9 21:22
 * @Description:
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
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
        System.out.println(containDuplicate.containsDuplicateMy1(nums));

    }
}
