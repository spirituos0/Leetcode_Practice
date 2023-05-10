package CodingBat.String1;

public class twoChar {

    public String twoChar(String str, int index) {

        String twoChars;;
        String twoChars2;

        if ((index+2 > str.length()) || (index < 1)) {
            twoChars2 = str.substring(0, 2);
            return twoChars2;
        }
        return twoChars = str.substring(index, index+2);

    }

}
