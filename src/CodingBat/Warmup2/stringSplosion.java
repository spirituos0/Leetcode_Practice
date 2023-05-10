package CodingBat.Warmup2;

public class stringSplosion {

    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
    }

    public static void main(String[] args) {
        stringSplosion("Code");
        System.out.println();
    }
}
