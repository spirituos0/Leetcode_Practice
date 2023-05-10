package CodingBat.Warmup1;

import java.util.Arrays;

public class intMaxClass {
    public static void main(String[] args) {
        System.out.println(intMaxLoop(1,3,2));
        System.out.println(intMaxSort(2,3,1));
    }
    public static int intMaxLoop(int a, int b, int c) {

        int[] arrayOfGivenInts = {a, b, c};
        int maxValue = arrayOfGivenInts[0];
        for (int i = 0; i < arrayOfGivenInts.length; i++) {
            maxValue = Math.max(arrayOfGivenInts[i], maxValue);
        }
        return maxValue;
    }
    public static int intMaxSort(int a, int b, int c) {
        int[] arrayOfGivenInts = {a, b, c};
        Arrays.sort(arrayOfGivenInts);
        return arrayOfGivenInts[arrayOfGivenInts.length-1];
    }
    public static int intMaxBetween2(int a, int b, int c) {

        int maxValue;
        if (a > b) {
            maxValue = a;
        } else {
            maxValue = b;
        }
        if (maxValue < c) {
            maxValue = c;
        }
        return maxValue;

    }
}
