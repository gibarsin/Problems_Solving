package store_credit;

import java.util.Scanner;

/**
 * Created by gonzalo on 10/2/15.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        for(int i = 0; i < testCases; i++) {
            int credit = sc.nextInt();
            int[] products = new int[sc.nextInt()];

            for(int j = 0; j < products.length; j++) { //Storing products in array
                products[j] = sc.nextInt();
            }
            int prod1, prod2;
            boolean found = false;

            for(int k = 0; k < products.length && !found; k++) {
                prod1 = products[k];
                for(int m = k + 1; m < products.length && !found; m++) {
                    prod2 = products[m];

                    if(prod1 + prod2 == credit) {
                        found = true;
                        System.out.println("Case #" + (i + 1) + ": " + (k + 1) + " " + (m + 1));
                    }
                }
            }
        }
    }
}
