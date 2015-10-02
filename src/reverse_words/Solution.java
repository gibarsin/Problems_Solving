package reverse_words;

import java.util.Scanner;

/**
 * Created by gonzalo on 10/2/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        sc.nextLine();
        for(int i = 0; i < testCases; i++) {
            String[] sentence = sc.nextLine().split("\\s+");
            for(int j = 0; j < sentence.length / 2; j++) {
                swap(sentence, j, sentence.length - j - 1);
            }
            System.out.print("Case #" + (i + 1) + ": ");
            for(int k = 0; k < sentence.length; k++) {
                System.out.print(sentence[k] + " ");
            }
            System.out.println();
        }
    }

    private static void swap(String[] sentence, int j, int i) {
        String aux = sentence[j];
        sentence[j] = sentence[i];
        sentence[i] = aux;
    }
}
