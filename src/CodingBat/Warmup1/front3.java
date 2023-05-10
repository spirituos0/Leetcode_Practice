package CodingBat.Warmup1;

public class front3 {

    public static void main(String[] args) {
        front3("Java");
    }

    public static String front3(String str) {

        String newStr = "";
        if ((str.length() >= 3)) {
            newStr = str.substring(0, 3);
        } else {
            newStr = str;
        }
        return newStr + newStr + newStr;
    }
}
