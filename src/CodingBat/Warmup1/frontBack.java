package CodingBat.Warmup1;

public class frontBack {

    public static void main(String[] args) {
        frontBack("code");
    }

    public static String frontBack(String str) {

        if (str.length() <= 1) {
            return str;
        }
        String insideStr = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + insideStr + str.charAt(0);
    }
}
