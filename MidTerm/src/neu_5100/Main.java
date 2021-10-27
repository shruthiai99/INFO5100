package neu_5100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Printer P1 = Printer.getInstance();
        System.out.println(P1.response);

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(sumOfRepeated(nums));

        System.out.println(nonRepeatingSubString("abcabcbb"));
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

    public static String nonRepeatingSubString(String string) {
        Set<Character> charSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        for (char letter : string.toCharArray()) {
            charSet.add(letter);
        }

        for (int i = 0; i < string.length() - charSet.size() + 1; i++) {
            String subString = string.substring(i, i + charSet.size());
            Set<Character> subSet = new HashSet<>();
            for (char letter : subString.toCharArray()) {
                subSet.add(letter);
            }
            if (subSet.size() > sb.length()) {
                for (char letter : subSet) {
                    sb.append(letter);
                }
            }

            if (subSet.size() == charSet.size()) {
                System.out.println("here");
                for (char letter : subSet) {
                    sb.append(letter);
                    return sb.toString();
                }
            }
        }

        return sb.toString();
    }
}
