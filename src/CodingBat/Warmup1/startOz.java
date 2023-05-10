package CodingBat.Warmup1;

public class startOz {

    public String startOz(String str) {

        String result = "";
        // mine
        if (str.length() >= 2) {
            if(str.startsWith("oz")) {
                return str.substring(0,2);
            } else if (str.startsWith("o")) {
                return str.substring(0,1);
            } else if (str.charAt(1) == 'z') {
                return str.substring(1,2);
            }
        } else if ((str.length() < 2) && (str.startsWith("o"))) {
            return str.substring(0,1);
        }
//        return result;

    // solution from the website:
        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }

        return result;
    }

}
