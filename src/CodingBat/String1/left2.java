package CodingBat.String1;

public class left2 {

    public String left2(String str) {

        String a;
        String b;

        if (str.length() >= 2) {
            a = str.substring(0, 2);
            b = str.substring(2);
            return b+a;
        } return str;

        // suggested:
        // return str.substring(2) + str.substring(0, 2);

    }

}
