package n_ways_sum.solution2;

import java.util.Scanner;

/**
 * Created by gonzalo on 10/3/15.
 * This case is solved for D(n) = D(n - 1) + D(n - 3) + D(n - 4)
 * The number of ways in which I can sum n with 1, 3 and 4
 * 1 - Dimensional DP Solution
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DpArray dp = new DpArray(n);

        dp.setWays(0, 1); //Base case

        for(int i = 1; i <= n; i++) {
            int way1 = dp.getWays(i - 1);
            int way3 = dp.getWays(i - 3);
            int way4 = dp.getWays(i - 4);
            dp.setWays(i, way1 + way3 + way4);
        }
        System.out.println("Number of ways for number " + n + " are " + dp.getSolution());
    }
}
