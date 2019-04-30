package primary_algorithm;

import java.util.Arrays;

/**
 * @Auther: moer
 * @Date: 2019/4/23 13:56
 * @Description:
 */
public class RotateArray {

    public static int[]  rotate(int [] nums,int k){
        //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        //代码解释:
        //　　Object src : 原数组
        //   int srcPos : 从元数据的起始位置开始
        //　　Object dest : 目标数组
        //　　int destPos : 目标数组的开始起始位置
        //　　int length  : 要copy的数组的长度


        int[] oper = new int[nums.length];
        System.arraycopy(nums, 0, oper, k%nums.length, nums.length-k%nums.length);
        System.out.println(Arrays.toString(oper));
        // nums 从 3 到 oper 0 長度為3
        System.arraycopy(nums, nums.length-k%nums.length, oper, 0, k%nums.length);
        System.out.println(Arrays.toString(oper));
        System.arraycopy(oper, 0, nums, 0, nums.length);
        return oper;
    }

    public static int[] rotate2(int [] nums,int k){
        if (k == nums.length || k == 0){
            return nums;
        }
        for (int i = nums.length-1; i >=k ; i--) {
            // i%7
            int tem = nums[i];//6
            nums[i] = nums[(nums.length-1-i) % nums.length];//1
            nums[(nums.length-1-i) % nums.length] = tem;
        }
        return nums;
    }

    public void rotate1(int[] nums, int k) {
        if (k == nums.length || k == 0){
            return;
        }
        int n = nums.length;
        for (int j = 0; j <k ; j++) {
            for (int i = nums.length-1; i>0 ; i--) {
                // i%7
                int tem = nums[i];//6
                nums[i] = nums[i-1];//1
                nums[i-1] = tem;
            }
        }
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        //{5,6,7,1,2,3,4} 6-3
        // 0.1.2.3.4.5.6
        System.out.println(Arrays.toString( RotateArray.rotate2(nums,3)));
    }
}
