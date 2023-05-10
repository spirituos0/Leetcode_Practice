package CodingBat.String1;

public class comboString {

    public String comboString(String a, String b) {

        if ((a.equals("")) || (b.equals(""))) {
            if (a.length() > b.length()) {
                return a;
            } else { return b; }

        } else if (a.length() > b.length()) {
            return b+a+b;
            } else { return a+b+a; }

    }

}
