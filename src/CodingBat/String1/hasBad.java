package CodingBat.String1;

public class hasBad {

    public boolean hasBad(String str) {


        if (str.length() > 3) {
            String containsBadAtIndex1 = str.substring(1, 4);
            if (str.startsWith("bad")) {
                return true;
            } else return containsBadAtIndex1.equals("bad");

        } else if (str.length() == 3) {
            return str.startsWith("bad");
        }
        return false;
    }
}
