package CodingBat.Warmup1;

public class missingCharClass {

    public static void main(String[] args) {
        missingChar("kitten", 1);
    }

    public static String missingChar(String str, int n) {

        int maxIndex = str.length() - 1 ;
        String beginning = "";
        String ending = "";
        if(n == 0)  {
            ending = str.substring(n+1, maxIndex+1);
        } else if (n == str.length()) {
            ending = str.substring(0, n);
        } else {
            beginning = str.substring(0, n);
            ending = str.substring(n+1, maxIndex+1);
        }
        return beginning+ending;
    }
}
