package n_ways_sum.solution1;

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
        int dp[] = new int[n + 1]; //dp[n] stores the result

        //Base cases
        for(int i = 0; i <= 2; i++) {
            dp[i] = 1;
        }
        dp[3] = 2;

        for(int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];
        }
        System.out.println("Number of ways for number " + n + " are " + dp[n]);
    }
}
