package CodingBat.String1;

public class withoutX2 {

    public String withoutX2(String str) {

        if (str.length() == 1) {
            if (str.charAt(0) == 'x') {
                return "";
            } else return str;
        }
        if (str.length() == 2) {
            if (str.equals("xx")) {
                return "";
            } else return str;
        } else if (str.length() > 2) {
            if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
                return str.substring(1);
            } else if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
                return str.substring(0,1).concat(str.substring(2));
            } else return str;
        } else return str;
    }

}
