package CodingBat.String1;

public class middleTwo {

    public String middleTwo(String str) {

        int str1last = (str.length()/2)-1;
        int str2first = str1last + 2;

        String newStr = str.substring(str1last, str2first);

        return newStr;
    }
}
