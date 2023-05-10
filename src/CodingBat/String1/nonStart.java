package CodingBat.String1;

public class nonStart {

    public String nonStart(String a, String b) {

        String subA;
        String subB;

        if (a.length() >= 1 && b.length() >=1 ) {

            subA = a.substring(1);
            subB = b.substring(1);
            String str = subA.concat(subB);
            return str;
        } return a+b;
    }

}
