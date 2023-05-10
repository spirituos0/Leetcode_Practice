package CodingBat.String1;

public class firstTwo {


    public String firstTwo(String str) {

        if (str.length() >= 2) {

            String first2 = str.substring(0,2);
            return first2;

        }
        return str;
    }

}
