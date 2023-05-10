package CodingBat.String1;

public class middleThree {

    public String middleThree(String str) {

        int indexMid = (str.length()-1)/2;

        return str.substring(indexMid-2, indexMid+1);
    }
}
