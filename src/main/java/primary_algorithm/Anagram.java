package primary_algorithm;

import java.sql.Connection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Auther: moer
 * @Date: 2019/5/5 13:46
 * @Description:
 * 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的一个字母异位词。
 *
 * 示例 1:
 *
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 *
 * 进阶:
 * 如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？
 *
 * 判断是否是字母异位词即判断字符串中是否只有字符的位置不同，也就是判断两个字符串中包含的字符以及这些字符出现的次数是否相同
 */
public class Anagram {
    public static boolean isAnagram(String s ,String t){
        if(s.length() != t.length()) {
            return false;
        }
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();
        Arrays.sort(s_chars);
        Arrays.sort(t_chars);
       return Arrays.equals(s_chars,t_chars);
    }

    public boolean isAnagram2(String s, String t) {
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        for (char ch : s.toCharArray()) {
            sCounts[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            tCounts[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sCounts[i] != tCounts[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagarama";
        System.out.println(Anagram.isAnagram(s,t));
    }
}
