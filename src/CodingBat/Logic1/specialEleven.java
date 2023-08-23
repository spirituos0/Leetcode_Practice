package CodingBat.Logic1;

public class specialEleven {

    public boolean specialEleven(int n) {

        int remainder = n % 11;
        boolean divisible = n % 11 == 0;

        return (divisible || remainder == 1);



    }
}
