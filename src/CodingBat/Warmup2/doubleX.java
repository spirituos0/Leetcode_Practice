package CodingBat.Warmup2;

public class doubleX {

    boolean doubleX(String str) {

        // mine:
//        return str.contains("xx");

        // suggested:
        int i = str.indexOf("x");
        if (i == -1) return false; // no "x" at all

        // Is char at i+1 also an "x"?
        if (i+1 >= str.length()) return false; // check i+1 in bounds?
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");

    }

}
