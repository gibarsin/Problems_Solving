package n_ways_sum.solution2;

/**
 * Created by gonzalo on 10/3/15.
 */
public class DpArray {
    private int n;
    private int dp[];

    public DpArray(int n) {
        dp = new int[n + 1];
        this.n = n;
    }

    public int getWays(int n) {
        if(n < 0) { //If n is negative then the number of ways to sum up for n is 0
            return 0;
        } else {
            return dp[n];
        }
    }

    public void setWays(int n, int ways) {
        dp[n] = ways;
    }

    public int getSolution() {
        return dp[n];
    }
}
