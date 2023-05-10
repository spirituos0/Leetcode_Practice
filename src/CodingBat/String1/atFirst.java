package CodingBat.String1;

public class atFirst {

    public String atFirst(String str) {

        String addAt = "@";

        if (str.length() == 1){
            return str+addAt;
        } else if (str.length() == 0){
            return str+addAt+addAt;
        }
        return str.substring(0,2);
    }


}
