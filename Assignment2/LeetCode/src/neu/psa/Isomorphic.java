package neu.psa;

import java.util.HashMap;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){

            return false;
        }
        HashMap<Character, Character> seen = new HashMap<>();
        int n = 0;
        while(n < s.length()){
            if (seen.containsKey(s.charAt(n))){
                if (t.charAt(n) != seen.get(s.charAt(n))){

                    return false;
                }
            }
            else if (seen.containsValue(t.charAt(n)))
            {
                return false;
            }

            else{
                seen.put(s.charAt(n), t.charAt(n));
            }

            n++;
        }
        return true;

    }
}
