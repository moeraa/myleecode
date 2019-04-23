package primary_algorithm;

import java.util.Arrays;

/**
 * @Auther: moer
 * @Date: 2019/4/23 17:19
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 *
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 *
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 *
 *
 *
 * 示例 1：
 *
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * @Description:
 */
public class ReverseString {
    public static char[] ReverseString1(char[] s) {
        for (int i = 0; i <s.length/2 ; i++) {
            char temp =  s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
        return s;
    }

    public static void main(String[] args) {
        char [] s = {'1','2','3','4','5','6','7'};
        //{5,6,7,1,2,3,4} 6-3
        // 0.1.2.3.4.5.6
        System.out.println(Arrays.toString( ReverseString.ReverseString1(s)));
    }

}
