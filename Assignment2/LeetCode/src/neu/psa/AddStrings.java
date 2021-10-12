package neu.psa;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();
        int l1 = num1.length();
        int l2 = num2.length();
        int carry = 0;
        int n1  = l1 - 1;
        int n2  = l2 - 1;
        int val1 = 0;
        int val2 = 0;
        while(n1 >= 0 || n2 >= 0 ){
            if (n1 < 0){
                val1 = 0;
            }
            else{
                val1 = Character.getNumericValue(chars1[n1]);
            }
            if(n2 < 0){
                val2 = 0;
            }
            else{
                val2 = Character.getNumericValue(chars2[n2]);
            }
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            result.append(String.valueOf(sum%10));
            n1--;
            n2--;
        }
        if (carry !=0){
            result.append(String.valueOf(carry));
        }
        return result.reverse().toString();
    }
}
