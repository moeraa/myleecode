package primary_algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: moer
 * @Date: 2019/4/16 09:56
 * @Description:
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TowSum {
    public static int[] towSum(int[] nums,int target){
        int[] result = new int[2];
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > target||nums[j] > target){
                    continue;
                }else if (nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }else {
                    continue;
                }

            }
        }
        return  result;
    }
    public static  int[] twoSum1(int[] nums, int target) {

        int max = 0xfff;
        int[] map = new int[max + 1];
        int index = 0, i;
        Arrays.fill(map, -1);
        for (i = 0; i < nums.length; i++) {
            index = (target - nums[i]) & max;
            if (map[index] != -1) {
                break;
            }
            map[nums[i] & max] = i;
        }
        return new int[]{map[index], i};
    }
    public static  int[] twoSum2(int[] nums, int target) {
        Map <Integer, Integer>map = new HashMap();
        for (int i = 0; i <nums.length ; i++) {
            int containkey = target - nums[i];
            if (map.containsKey(containkey)){
                return new int[]{ map.get(containkey),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

        public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        System.out.println(Arrays.toString(TowSum.twoSum2(nums,target)));
    }
}
