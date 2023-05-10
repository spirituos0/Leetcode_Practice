package CodingBat.String1;

public class makeTags {

    public String makeTags(String tag, String word) {

        String a1 = "<";
        String a2 = "</";
        String b = ">";
        String newStr = a1 + tag + b + word + a2 + tag + b;
        return newStr;


    }

}
