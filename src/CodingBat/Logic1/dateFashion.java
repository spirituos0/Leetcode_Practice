package CodingBat.Logic1;

public class dateFashion {

    public int dateFashion(int you, int date) {

        int yes = 2;
        int maybe = 1;
        int no = 0;

        if ((you <= 2) || (date <= 2)) {
            return no;
        } else if ((you >= 8) || (date >= 8)) {
            return yes;
        } else {
            return maybe;
        }
    }

}
