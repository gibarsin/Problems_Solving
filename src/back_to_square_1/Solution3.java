package back_to_square_1;

import java.util.Scanner;

/**
 * Created by gonzalo on 10/21/15.
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int N = sc.nextInt();

            if(N == 0) {
                break;
            } else if(N == 1) {
                System.out.println("1");
            } else {
                double[] expectedMoves = new double[N + 1];

                expectedMoves[0] = 0;
                expectedMoves[1] = 1;

                for(int i = 2; i <= N; i++) {
                    expectedMoves[i] = 1 + expectedMoves[i - 1] / sc.nextDouble();
                }
                System.out.println(Math.round(expectedMoves[N]));
            }
        }
    }
}
