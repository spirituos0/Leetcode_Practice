package CodingBat.Warmup1;

public class max1020 {

    public int max1020(int a, int b) {

        // mine
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            return Math.max(a, b); // comparing to get Max
        } else if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            if ((a >= 10 && a <= 20)) {
                return a;
            } return b;
        }

        // website suggestion:
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;

        return 0;



    }


}
