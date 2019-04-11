package primary_algorithm;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @Auther: moer
 * @Date: 2019/4/11 10:15
 * @Description:
 * 给定两个数组，编写一个函数来计算它们的交集
 * 示例 1:
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 次数
 */
public class Intersect {
    public static int[] intersect(int[] nums1,int[] nums2){
        List<Integer> set = new ArrayList<Integer>();
            for (int i = 0; i < nums1.length; i++) {
                for (int j = 0; j <nums2.length ; j++) {
                    if (nums1[i] == nums2[j]) {
                        set.add(nums1[i]);
                    }
                }
        }
        int results[] = new int[set.size()];
        int a =0;
        for (int aa : set) {
            results[a]= aa;
            a++;
        }

        return results;
    }
//    使用集合
    public static int[] intersect1(int[] nums1,int[] nums2){
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int num:nums1){
            list1.add(num);
        }
        for (Integer num:nums2){
            if (list1.contains(num)){
                list2.add(num);
                list1.remove(num);
            }
        }
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num:list2
             ) {
            res[i++] = num;
        }
        return  res;
    }
//    lamda
    public static int[] intersect2(int[] nums1,int[] nums2){
        List<Integer> list1 = Arrays.stream(nums1).boxed()
                .collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed()
                .filter(num->{
                    if (list1.contains(num)){
                        list1.remove(num);
                        return true;
                    }
                    return false;
                }).collect(Collectors.toList());
        int[] res = new int[list2.size()];
        int i = 0;
        for (int num:list2
        ) {
            res[i++] = num;
        }
        return  res;
}
//使用的是map 映射
    public static int[] intersect3(int[] nums1,int[] nums2){
       Map<Integer,Integer> map = new HashMap<>(nums1.length);
        for (int num:nums1) {
            Integer count = map.get(num);
            if (count == null){
                map.put(num,1);
            }else {
                map.put(num,++count);
            }

        }
        List<Integer>list = new ArrayList<>();
        for (int num:nums2) {
            Integer count = map.get(num);
            if (count != null &&count != 0){
                list.add(num);
                map.put(num,--count);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;

    }
    public static int[] intersect4(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();
        for (int i = 0,j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] < nums2[j]){
                i++;
            }else if (nums1[i] > nums2[j]){
                j++;
            }else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }



    public static void main(String[] args) {
        int[] nums1 = {1, 23, 4, 6};
        int[] nums2 = {23, 6};
        System.out.println(Arrays.toString(Intersect.intersect(nums1, nums2)));
        System.out.println(Arrays.toString(Intersect.intersect1(nums1, nums2)));
        System.out.println(Arrays.toString(Intersect.intersect2(nums1, nums2)));
        System.out.println(Arrays.toString(Intersect.intersect3(nums1, nums2)));
        System.out.println(Arrays.toString(Intersect.intersect4(nums1, nums2)));
    }
}
