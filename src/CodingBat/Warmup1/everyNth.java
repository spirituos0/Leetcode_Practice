package CodingBat.Warmup1;

public class everyNth {

    public String everyNth(String str, int n) {

        String newStr = "";
        for (int i = 0; i < str.length(); i=i+n) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }
}
