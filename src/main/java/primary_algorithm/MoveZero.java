package primary_algorithm;

import java.util.Arrays;

/**
 * @Auther: moer
 * @Date: 2019/4/15 11:08
 * @Description:
 *   移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class MoveZero {
    public static int[] moveZero(int[] nums){
        if (nums.length == 1){
            return nums;
        }
        for (int i = 0; i <nums.length; i++) {
            for (int k = i+1; k <nums.length ; k++) {
                if (nums[i] == 0){
                    if (nums[k] == 0){
                        continue;
                    }else {
                        int temp = nums[k];
                        nums[k] = nums[i];
                        nums[i] = temp;
                    }
                }else {
                    continue;
                }
            }
        }
        return nums;
    }
    public static int[] moveZero1(int[] nums){
        int i = 0,j = 0;
        for(i = 0 ; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[j++] = nums[i];
            }
        }
        while(j < nums.length)
        {
            nums[j++] = 0;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {4,2,4,0,0,3,0,5,1,0};
//        System.out.println(Arrays.toString(MoveZero.moveZero(nums)));
        System.out.println(Arrays.toString(MoveZero.moveZero1(nums)));

    }
}
