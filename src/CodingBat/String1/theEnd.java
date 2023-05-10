package CodingBat.String1;

public class theEnd {

    public String theEnd(String str, boolean front) {

        if (front) {
            return String.valueOf(str.charAt(0));
        } return str.valueOf(str.charAt(str.length()-1));

    }

}
