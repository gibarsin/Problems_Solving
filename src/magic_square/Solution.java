package magic_square;

import java.util.Scanner;

/**
 * Created by gonzalo on 10/21/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N < 1 || N > 600) {
            return;
        }

        int[][] square = new int[N][N];
        int[] lines = new int[2 * N + 1];

        int diagonal = 0;
        int diagonalInverted = 0;

        for(int i = 0, curr; i < N; i++) {
            for(int j = 0; j < N; j++) {
                curr = sc.nextInt();
                square[i][j] = curr;

                //Rows
                lines[N + 1 + i] += curr;
                //Cols
                lines[N - 1 - j] += curr;
            }
            diagonal += square[i][i];
            lines[N] += square[i][N - 1 - i];
        }

        int checked = 0;
        int[] pos = new int[2 * N + 1];

        for(int i = 0; i < lines.length; i++) {
            if(lines[i] != diagonal) {
                if(i <= N) {
                    pos[checked] = -(N - i);
                } else {
                    pos[checked] = i - N;
                }
                checked++;
            }
        }
        System.out.println(checked);

        for(int i = 0; i < checked; i++) {
            System.out.println(pos[i]);
        }
    }
}
