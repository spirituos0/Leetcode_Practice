package CodingBat.String1;

public class extraFront {

    public String extraFront(String str) {

        String newStr = "";

        if (str.length() >= 2) {

            newStr = (Character.toString(str.charAt(0))
                    + Character.toString(str.charAt(1)));
            return newStr+newStr+newStr;
        } else {
        return str+str+str;
        }
    }
}
