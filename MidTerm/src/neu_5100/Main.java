package neu_5100;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Printer P1 = Printer.getInstance();
        System.out.println(P1.response);

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(sumOfRepeated(nums));

        System.out.println(nonRepeated("abcabcbb"));
    }

    //Question 3
    public static int sumOfRepeated(int[] nums) {
        int result = 0;
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                result += entry.getKey();
            }
        }

        return result;
    }

//    public static String nonRepeatingSubString(String string) {
//        Set<Character> charSet = new HashSet<>();
//        StringBuilder sb = new StringBuilder();
//        sb.append("");
//        for (char letter : string.toCharArray()) {
//            charSet.add(letter);
//        }
//
//        for (int i = 0; i < string.length() - charSet.size() + 1; i++) {
//            String subString = string.substring(i, i + charSet.size());
//            Set<Character> subSet = new HashSet<>();
//            for (char letter : subString.toCharArray()) {
//                subSet.add(letter);
//            }
//            if (subSet.size() > sb.length()) {
//                for (char letter : subSet) {
//                    sb.append(letter);
//                }
//            }
//
//            if (subSet.size() == charSet.size()) {
//                for (char letter : subSet) {
//                    sb.append(letter);
//                    return sb.toString();
//                }
//            }
//        }
//
//        return sb.toString();
//    }
//Question 4
    public static String nonRepeated(String string){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        Set<Character> set = new HashSet<>();
        char[] chars = string.toCharArray();
        int i = 0;
        List<String> list = new ArrayList<>();
        String result = "";
        while(i < chars.length){
            if(!set.contains(chars[i])){
                set.add(chars[i]);
                sb.append(chars[i]);
                i++;
            }
            else{
                if(sb.length() > result.length()){
                    result = sb.toString();
                }
                sb = new StringBuilder();
                set.clear();
            }
        }
        return result;
    }
}
