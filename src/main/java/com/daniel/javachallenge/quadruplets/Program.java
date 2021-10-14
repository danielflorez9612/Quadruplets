package com.daniel.javachallenge.quadruplets;

import java.util.ArrayList;
import java.util.List;

/**
 * @author daniel.florez.contractor@gdevtools.com 13/10/21
 */
public final class Program {

    /**
     * This method returns all the combinations of 4 numbers in an array that sum up to the target sum
     * @param array an array of unique integers
     * @param targetSum the sum to achieve
     * @return a list of combinations that sum up to the target sum
     */
    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        for (int i = 0; i< array.length; i++) {
            for (int j = i+1; j<array.length;j++) {
                for (int k = j+1; k<array.length; k++) {
                    for (int m = k+1; m<array.length;m++) {
                        Integer[] ints = new Integer[]{array[i],array[j],array[k],array[m]};
                        if (sumAddsTo(ints, targetSum)) {
                            result.add(ints);
                        }
                    }
                }
            }
        }
        return result;
    }

    private static boolean sumAddsTo(Integer[] ints, int targetSum) {
        int sum = 0;
        for (Integer integer: ints) {
            sum+=integer;
        }
        return sum == targetSum;
    }
}
