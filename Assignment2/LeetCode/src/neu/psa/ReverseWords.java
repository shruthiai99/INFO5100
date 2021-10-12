package neu.psa;

import java.util.ArrayDeque;
import java.util.Deque;

public class ReverseWords {
    public String reverseWords(String s) {
        int left = 0;
        int right = s.length()-1;
        while(s.charAt(left) == ' '){
            left++;
        }

        while(s.charAt(right) == ' '){
            right--;
        }

        StringBuilder sb = new StringBuilder();
        Deque<String> dequeu =  new ArrayDeque();

        while(left <= right){
            if(s.charAt(left) == ' ' && sb.length() != 0){
                dequeu.offerFirst(sb.toString());
                sb.setLength(0);
            }
            else if(s.charAt(left) != ' '){
                sb.append(s.charAt(left));

            }
            left ++;
        }
        dequeu.offerFirst(sb.toString());

        return String.join( " ", dequeu);


    }
}
