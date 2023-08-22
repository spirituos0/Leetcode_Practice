package CodingBat.String1;

import java.util.Locale;

public class startWord {

    public String startWord(String str, String word) {

        String firstLetter;

        if ((word.length() > 1) && (str.length() > 1)) {
            firstLetter = str.substring(0,1);
            if (word.equals(str.substring(0, word.length()) )) {
                // WARNING: word.length() or word.length()-1 seems to not matter in this case
                return word;
            } else if (word.substring(1).equals(str.substring(1, word.length()))) {
                // BUT it matters here. If I change to -1, it fails tests.
                return firstLetter.concat(str.substring(1, word.length()));
            } else return "";
        } else if (word.length() == 1) {
            if (str.equals("")) {
                return "";
            }
            return str.substring(0,1);
        } else if (str.length() < 1) {
            return "";
        } else return "";

    }


}
