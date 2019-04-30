package primary_algorithm;

/**
 * @Auther: moer
 * @Date: 2019/4/29 14:36
 * @Description:
 *
 * 字符串中的第一个唯一字符
 */
public class FirstUniqChar {
    public static  int firstUniqChar(String s){
        int a = 0;
        char[] toCharArray = s.toCharArray();
        if (toCharArray.length > 1){
            for (int i = 0;i <=toCharArray.length-1;i++){
                if (s.lastIndexOf(toCharArray[i]) == s.indexOf(toCharArray[i]) ){
                    a = i;
                    return  a;
                }else {
                    a = -1;
                }
            }
        }else if(toCharArray.length == 1){
            a = 0;
        }else {
            a = -1;
        }
        return a;
    }

    public static void main(String[] args) {
        String x = "aal";
        System.out.println(FirstUniqChar.firstUniqChar(x));
        System.out.println("a".indexOf('a'));
    }
}
