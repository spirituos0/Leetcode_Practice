package CodingBat.String1;

public class withoutEnd2 {

    public String withoutEnd2(String str) {

        if (str.length() == 3) {
            return String.valueOf(str.charAt(1));
        } else if (str.length() > 3) {
            return str.substring(1, str.length()-1);
        } else if (str.length() < 3) {
            return "";
        }
        return str;
    }

}
