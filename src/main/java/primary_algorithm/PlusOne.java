package primary_algorithm;

import java.util.Arrays;

/**
 * @Auther: moer
 * @Date: 2019/4/12 09:48
 * @Description: 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 */
public class PlusOne {

    public static  int[] plusOne(int[] digits) {
        int[] temp = new int[digits.length + 1];
        boolean flag = false;
        int a = 1;
        if (digits == null) {
            return digits;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i != 0) {
                if (digits[i] + a > 9) {
//                    digits[i - 1] = digits[i - 1] + a;
                    digits[i] = 0;
                    a = 1;
                } else {
                    digits[i] = digits[i] + 1;
                    a=0;
                    break;
                }
            } else {
                if (digits[i] + 1 > 9) {
                    flag = true;
                    temp[0] = 1;
                    digits[i] = 0;

                } else {
                    digits[i] = digits[i] + 1;
                    break;
                }

            }
        }
        if (flag) {
            for (int i = 0; i < digits.length; i++) {
                temp[i + 1] = digits[i];
            }
            return temp;

        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        int[] nums = {8,9,9,9};
        System.out.println(Arrays.toString(PlusOne.plusOne(nums)));

    }

}
