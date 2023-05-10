package CodingBat.Warmup1;

public class front22 {

    public String front22(String str) {


        if (str.length() < 2) {
            return str + str + str;
        } else if (str.equals("")) {
            return str;
        }
        String twoLetters = str.substring(0, 2);
        return twoLetters + str + twoLetters;

    }

}
