package CodingBat.Warmup2;

public class frontTimes {

    public String frontTimes(String str, int n) {

        String result = "";

        for (int i = 0; i < n; i++) {
            if (str.length() >= 3) {
                String frontSub = str.substring(0, 3);
                result = result + frontSub;
            } else {
                result = result + str;
            }
        }
        return result;
    }

    // suggested:
//    public String frontTimes(String str, int n) {
//        int frontLen = 3;
//        if (frontLen > str.length()) {
//            frontLen = str.length();
//        }
//        String front = str.substring(0, frontLen);
//
//        String result = "";
//        for (int i=0; i<n; i++) {
//            result = result + front;
//        }
//        return result;
//    }

}
