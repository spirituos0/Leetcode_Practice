//package TwoSum;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class TwoSum {
//
//    public int[] twoSum(int[] nums, int target) {
//
//        for (int i = 0; i < nums.length; i++) {
//
//            for (int j = i + 1; j < nums.length; i++) {
//
//                int complement = target - nums[i];
//
//                if (nums[j] == complement) {
//                    return new int[]{i, j};
//                }
//            }
//        } throw new IllegalArgumentException("no match found");
//    }
//
//}
