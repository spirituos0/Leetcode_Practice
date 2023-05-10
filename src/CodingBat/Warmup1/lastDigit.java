package CodingBat.Warmup1;

public class lastDigit {

    public boolean lastDigit(int a, int b) {

        // mine:
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        return strA.charAt(strA.length() - 1) == strB.charAt(strB.length() - 1);

        // suggested (cleaner, shorter):
//        return(a % 10 == b % 10);

    }

}
