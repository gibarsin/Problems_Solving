package back_to_square_1;

import java.util.Scanner;

/**
 * Created by gonzalo on 10/21/15.
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int N = sc.nextInt();

            if(N == 0) {
                break;
            } else if(N == 1) {
                System.out.println("1");
            } else {
                System.out.println(Math.round(expectedMoves(sc, N)));
            }
        }
    }

    private static double expectedMoves(Scanner sc, int pos) {
        if(pos == 1) {
            return 1;
        }
        return 1 + expectedMoves(sc, pos - 1) / sc.nextDouble();
    }
}
