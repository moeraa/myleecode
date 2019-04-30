package primary_algorithm;

import java.awt.*;
import java.util.ArrayList;

/**
 * @Auther: moer
 * @Date: 2019/4/25 14:46
 * @Description:
 * 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 */
public class ReverseInt {
    public  static int reverse(int x){
        long result = 0;
        boolean flag = false;
        if (x <= Integer.MIN_VALUE){
            return  0 ;
        }
        if (x >= Integer.MAX_VALUE){
            return  0 ;
        }
        if (x < 0){
            flag = true;
            x = -x;
        } {
            while (x!=0){
                result = result*10+(x%10);
                x = x/10;
            }
            if (result >  Integer.MAX_VALUE){
                return 0 ;
            }
        }
        if (flag){
            result = -result;
        }
        return (int)result;
    }

    public static void main(String[] args) {
//        System.out.println(ReverseInt.reverse(210));
//        System.out.println(ReverseInt.reverse(-123));
//        System.out.println(ReverseInt.reverse(1));
//        System.out.println(ReverseInt.reverse(-2147483648));
        String aa = "1,2,3,,";
        String[] split = aa.split(",");
        System.out.println(split);

    }
}
