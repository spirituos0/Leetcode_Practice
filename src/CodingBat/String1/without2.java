package CodingBat.String1;

public class without2 {

    public String without2(String str) {


        if (str.length() > 2) {
            if ((str.charAt(0) == str.charAt(str.length() - 2))
                    && (str.charAt(1) == str.charAt(str.length() - 1))) {
                return str.substring(2);
            } else { return str; }
        } else if (str.length() == 2) {
            return "";
        } else { return str; }
    }
}
