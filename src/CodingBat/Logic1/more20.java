package CodingBat.Logic1;

public class more20 {

    public boolean more20(int n) {

        int remainder = n % 20;
        boolean divisible = n % 20 == 0;

       return (remainder >= 1 && remainder <=2);

    }

}
