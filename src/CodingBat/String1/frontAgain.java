package CodingBat.String1;

public class frontAgain {

    public boolean frontAgain(String str) {

        if (str.length() > 2) {
            return (str.charAt(0) == str.charAt(str.length() - 2)) && (str.charAt(1) == str.charAt(str.length() - 1));
        } else return str.length() == 2;
    }


}
