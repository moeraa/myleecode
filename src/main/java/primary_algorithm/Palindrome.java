package primary_algorithm;

import java.util.ArrayList;

/**
 * @Auther: moer
 * @Date: 2019/5/5 14:14
 * @Description: 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 说明：本题中，我们将空字符串定义为有效的回文串
 */
public class Palindrome {
    public static boolean isPalindrome(String s) {
        boolean result = false;
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        ArrayList temps = new ArrayList(chars.length);
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= '0' && chars[i] <= '9')) {
                temps.add(chars[i]);
            }
        }
        if (temps.size() <= 1) {
            return true;
        }
        for (int i = 0; i < temps.size() / 2; i++) {
            if (temps.get(i).equals(temps.get(temps.size() - 1 - i))) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }

    public static boolean isPalindrome1(String s) {
        boolean result = false;
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        ArrayList temps = new ArrayList(chars.length);
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetterOrDigit(chars[i])) {
                temps.add(chars[i]);
            }
        }
        if (temps.size() <= 1) {
            return true;
        }
        for (int i = 0; i < temps.size() / 2; i++) {
            if (temps.get(i).equals(temps.get(temps.size() - 1 - i))) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(Palindrome.isPalindrome1(s));
    }
}
