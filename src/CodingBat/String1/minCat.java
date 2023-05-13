package CodingBat.String1;

public class minCat {

    public String minCat(String a, String b) {

        String trimmedStr;

        if (a.length() > b.length()) {
            trimmedStr = a.substring(a.length() - b.length());
            return trimmedStr.concat(b);
        } else {
            trimmedStr = b.substring(b.length() - a.length());
            return a.concat(trimmedStr);
        }
    }
}
