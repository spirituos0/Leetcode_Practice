package CodingBat.Warmup1;

public class endUp {

    public String endUp(String str) {

        if (str.length() < 3) {
            return str.toUpperCase();
        }
        else {

            String beginning = str.substring(0, str.length()-3);
            String endingUpper = str.substring(str.length()-3).toUpperCase();
            return  beginning + endingUpper;
        }
    }
}
