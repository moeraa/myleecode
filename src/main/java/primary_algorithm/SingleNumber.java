package primary_algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @Auther: moer
 * @Date: 2019/4/10 17:30
 * @Description:
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 */
public class SingleNumber {
    public int singleNumber(int nums[]){
        int tag = 0;
        if (nums == null) {
            tag = 0;
        }
        if (nums.length == 1) {
            tag = nums[0];
        }
        HashSet <Integer>set= new HashSet<Integer>(nums.length);
        for (int i = 0; i <nums.length ; i++) {
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        tag = set.iterator().next();
        return tag;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int nums[] = { 1,3,44,44,1};
        System.out.println( singleNumber.singleNumber(nums));
    }
}
