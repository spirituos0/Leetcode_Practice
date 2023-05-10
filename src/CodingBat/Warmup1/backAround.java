package CodingBat.Warmup1;

public class backAround {

    public String backAround(String str) {

        if (str.length() <= 1) {
            return str + str + str;
        }
        char lastLetter = str.charAt(str.length()-1);

        return lastLetter + str + lastLetter;

    }
}
