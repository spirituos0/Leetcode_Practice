package HackerRank;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length()-1;

        String str1;
        String str2;
        for (int i = 0; i <= n; i+=2) {
            str1 = s.substring(i, i+1);
            System.out.print(str1);
        }
        System.out.print(" ");
        for (int i = 1; i <= n; i+=2) {
            str2 = Character.toString(s.charAt(i));
            System.out.print(str2);
        }

        sc.close();
    }
}
