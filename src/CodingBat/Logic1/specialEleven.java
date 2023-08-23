package CodingBat.Logic1;

public class specialEleven {

    public boolean specialEleven(int n) {

        int mod = n % 11;
        int remainder = n - (n % 11);

         return mod >= 1 && (remainder >= 0 && remainder <= 1);


    }
}
