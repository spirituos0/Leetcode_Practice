package CodingBat.String1;

public class withoutEnd {

    public String withoutEnd(String str) {

        if (str.length() >= 2 ) {

            String newStr = str.substring(1,str.length()-1);
            return newStr;
        }
        return str;
    }

}
