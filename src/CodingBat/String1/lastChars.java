package CodingBat.String1;

public class lastChars {

    public String lastChars(String a, String b) {

        // My solution, that did not work properly:
        /*
        String at = "@";
        String newStr = "";

        if (a.length()-1 <= 1) {
            if (a.length() == 1) {
                newStr = a.substring(0,1) + b.substring(b.length()-1);
            } else if (b.length()-1 <= 1) {
                newStr = at+at;
                return newStr;
            } else newStr = at + b.substring(b.length()-1);
            return newStr;
        } else if (b.length() <=1) {
            newStr = a.substring(0, 1) + at;
            return newStr;
        } else {
            newStr = a.substring(0,1) + b.substring(b.length()-1);
            return newStr;
        }

         */

        // suggested proper solution:
        if(a.length() == 0)
            a = "@";
        if(b.length() == 0)
            b = "@";
        return a.substring(0,1) + b.substring(b.length()-1, b.length());

    }

}
