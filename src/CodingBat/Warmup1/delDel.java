package CodingBat.Warmup1;

import java.util.Arrays;

public class delDel {

    public String delDelMine(String str) {

        boolean containsDel = str.contains("del");
        if (str.length() < 4) {
            return str;
        }
        else if (containsDel) {
            if ((str.charAt(1) == 'd') && (str.charAt(2) == 'e') && (str.charAt(3) == 'l')) {
                String firstLetter = String.valueOf(str.charAt(0));
                String leftover = str.substring(4, str.length());
                return firstLetter + leftover;
            }
        }
        return str;
    }

    public String delDelBetter(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            // First char + rest of string starting at 4
            return str.substring(0, 1) + str.substring(4);
        }
        // Otherwise return the original string.
        return str;
    }


}
