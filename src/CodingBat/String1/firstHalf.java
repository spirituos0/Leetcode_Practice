package CodingBat.String1;

public class firstHalf {

    public String firstHalf(String str) {

        int middleIndex = str.length() / 2;
        String firstHalfSub = str.substring(0,middleIndex);
        return firstHalfSub;

    }

}
