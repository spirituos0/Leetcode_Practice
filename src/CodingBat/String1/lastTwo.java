package CodingBat.String1;

public class lastTwo {

    public String lastTwo(String str) {

        char lastChar;
        char oneBeforeLast;
        String newStr= "";
        String beforeLast2 = "";
        if (str.length() > 2) {
            oneBeforeLast = str.charAt(str.length() - 2);
            lastChar = str.charAt(str.length() - 1);
            beforeLast2 = str.substring(0, str.length() - 2);
            newStr = beforeLast2.concat(Character.toString(lastChar)
                    .concat(Character.toString(oneBeforeLast)));
            return newStr; }
        else if (str.length() == 2) {
            lastChar = str.charAt(str.length() - 1);
            oneBeforeLast = str.charAt(0);
            newStr = Character.toString(lastChar)
                    .concat(Character.toString(oneBeforeLast));
            return newStr;
        } else return str;
    }

}
