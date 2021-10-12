package neu.psa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TransposeMatrix tm = new TransposeMatrix();
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] result;
        result = tm.transposeMatrix(matrix);
        System.out.println(Arrays.deepToString(result));

        ShortestWordDistance swd = new ShortestWordDistance();
        String[] wordsDict = {"practice", "makes", "perfect", "coding", "makes"};
        System.out.println(swd.shortestWordDistance(wordsDict, "makes", "coding"));

        MoveZeroes mz = new MoveZeroes();
        int [] nums = {0,1,0,3,12};
        mz.moveZeroes(nums);
        printArray(nums);

        RotateImage ri = new RotateImage();
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        ri.rotate(matrix2);
        System.out.println(Arrays.deepToString(matrix2));

        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> spiralResult = sm.spiralMatrix(matrix3);
        System.out.println(Arrays.toString(spiralResult.toArray()));

        Isomorphic iso = new Isomorphic();
        String s = "egg";
        String t = "add";
        boolean ans = iso.isIsomorphic(s,t);
        System.out.println(ans);

        AddStrings addStrings = new AddStrings();
        String num1 = "111";
        String num2 = "234";
        String res = addStrings.addStrings(num1,num2);
        System.out.println(res);

        Palindrome palindrome = new Palindrome();
        String st = "A man, a plan, a canal: Panama";
        boolean res2 = palindrome.isPalindrome(st);
        System.out.println(res2);

        ReverseWords reverseWords = new ReverseWords();
        String sentence = "blue is sky the";
        String reversed = reverseWords.reverseWords(sentence);
        System.out.println(reversed);

        StringCompression stringCompression = new StringCompression();
        char[] compress = {'a','a','b','b','c','c','c'};
        int compressed = stringCompression.stringCompress(compress);
        System.out.println(compressed);
    }

    public static void printArray(int[] nums){
        for(int num : nums){
            System.out.print(num +", ");
        }
        System.out.println();
    }
}
