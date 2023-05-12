package CodingBat.String1;

public class conCat {

    public String str(String a, String b) {

        if ((a.length() >= 1) && (b.length() >=1) && (a.charAt(a.length()-1) == b.charAt(0))) {
            return a.concat(b.substring(1)); }

        else {
        return a.concat(b); }
    }

}
