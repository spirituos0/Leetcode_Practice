package CodingBat.String1;

public class endsLy {

    public boolean endsLy(String str) {
        boolean answer = false;
        if (str.length() < 2) {
            return false;
        }
        if (str.substring(str.length() - 2).equals("ly")) {
            return true;
        }
        return answer;
    }
}
