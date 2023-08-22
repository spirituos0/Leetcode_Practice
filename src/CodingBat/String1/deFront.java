package CodingBat.String1;

public class deFront {

    public String deFront(String str) {

        String newStr = "";
        char a = 'a';
        char b = 'b';

        if ((str.charAt(0) == a) && (str.charAt(1) == b)) {
            return str;
        } else if (str.length() >= 2) {
            if (str.charAt(0) == a) {
                newStr = a + str.substring(2);
                return newStr;
            } else if (str.charAt(1) == b) {
                newStr = b + str.substring(2);
                return newStr;
            } else {
                return str.substring(2);
            }
        } else {
            if (str.equals(Character.toString(a))) {
                return str;
            } return "";

        }
    }

}
