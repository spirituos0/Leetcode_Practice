package CodingBat.Warmup2;

public class stringTimes {

    public static void main(String[] args) {

        stringTimes("Hi", 2);
    }
    public static String stringTimes(String str, int n) {

        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }
}
