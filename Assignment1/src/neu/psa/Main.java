package neu.psa;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

    }

    //Q1
    public static int sumOfUniques(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (seen.containsKey(nums[i])) {
                seen.put(nums[i], seen.getOrDefault(nums[i], 0) + 1);
            } else {
                seen.put(nums[i], 1);
            }
        }

        for (int key : seen.keySet()) {
            if (seen.get(key) == 1) {
                count += key;
            }
        }
        return count;
    }

    //Q2
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int low = 0;
        int high = nums.length - 1;
        int index = nums.length - 1;
        int square = 0;
        while (low <= high) {
            int low_value = Math.abs(nums[low]);
            int high_value = Math.abs(nums[high]);
            if (low_value > high_value) {
                square = low_value;
                low++;
            } else {
                square = high_value;
                high--;
            }
            result[index] = square * square;
            index--;
        }
        return result;
    }

    //Q3
    public static int uniqueElement(int[] nums) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.containsKey(nums[i])) {
                seen.put(nums[i], seen.getOrDefault(nums[i], 0) + 1);
            } else {
                seen.put(nums[i], 1);
            }
        }
        for (int key : seen.keySet()) {
            if (seen.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    //Q4
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> ransom = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if (ransom.containsKey(ransomNote.charAt(i))) {
                ransom.put(ransomNote.charAt(i), ransom.getOrDefault(ransomNote.charAt(i), 0) + 1);
            } else {
                ransom.put(ransomNote.charAt(i), 1);
            }
        }
        for (int j = 0; j < magazine.length(); j++) {
            if (ransom.containsKey(magazine.charAt(j))) {
                ransom.put(magazine.charAt(j), ransom.getOrDefault(magazine.charAt(j), 0) - 1);
            }
        }
        for (Character key : ransom.keySet()) {
            if (ransom.get(key) > 0) {
                return false;
            }
        }
        return true;
    }

    //Q5
    public static boolean alternativeCharInt(String value) {
        boolean flag = isChar(value.charAt(0));
        if (flag == true) {
            for (int i = 0; i < value.length(); i += 2) {
                if (isChar(value.charAt(i)) == false) {
                    return false;
                }
            }
            for (int i = 1; i < value.length(); i += 2) {
                if (isChar(value.charAt(i)) == true) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < value.length(); i += 2) {
                if (isChar(value.charAt(i)) == true) {
                    return false;
                }
            }
            for (int i = 1; i < value.length(); i += 2) {
                if (isChar(value.charAt(i)) == false) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isChar(char i) {
        if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
            return true;
        } else {
            return false;
        }
    }

}
