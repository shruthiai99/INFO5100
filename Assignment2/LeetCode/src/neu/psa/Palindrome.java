package neu.psa;

public class Palindrome {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while(low < high){
            if(Character.isLetterOrDigit(s.charAt(low)) && Character.isLetterOrDigit(s.charAt(high))){
                if(Character.toLowerCase(s.charAt(low)) == Character.toLowerCase(s.charAt(high))){
                    high --;
                    low ++;
                }
                else{
                    return false;
                }
            }
            while(!Character.isLetterOrDigit(s.charAt(low)) && low < high){
                low++;
            }
            while(!Character.isLetterOrDigit(s.charAt(high)) && low < high){
                high--;
            }
        }
        return true;
    }
}
