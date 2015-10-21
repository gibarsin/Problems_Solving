package back_to_square_1;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by gonzalo on 10/21/15.
 *
 * This gives an approximate solution, almost correct, if MAX_TIMES is increased, probability of
 * getting correct value increases
 */
public class Solution {
    private static final int MAX_TIMES = 10000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while(sc.hasNextInt()) {
            int N = sc.nextInt();

            if(N == 0) {
                break;
            } else if(N == 1) {
                System.out.println("0");
            } else {
                double[] board = new double[N];

                for(int i = 1; i < board.length; i++) {
                    board[i] = sc.nextDouble();
                }

                int globalTurns = 0;
                for(int times = 0; times < MAX_TIMES; times++) {
                    int currPos = 1;
                    int turns = 1;

                    while (currPos < N) {
                        boolean advance = rand.nextFloat() < board[currPos];

                        currPos = advance ? currPos + 1 : 1;
                        turns++;
                    }
                    globalTurns += turns;
                }

                System.out.println(Math.round((double)globalTurns / MAX_TIMES));
            }
        }

    }
}
