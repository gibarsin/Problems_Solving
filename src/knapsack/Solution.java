package knapsack;

import java.util.Scanner;

/**
 * Created by gonzalo on 10/2/15.
 *
 * Order of Algorithm is O(N * W) being N the number of items and W the Max weight supported
 *
 * Standard input is:
 * 1 line with max weight supported by the backpack
 * 1 line with N being Number of Items to examine
 * N lines containing weight, value
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt(); //Weight supported by the backpack
        int itemsNumber = sc.nextInt(); //Number of items to steal
        Item[] items = new Item[itemsNumber + 1];

        // Element 0 is left NULL so dpSolution code is more readable
        for(int i = 1; i <= itemsNumber; i++) {
            items[i] = new Item(sc.nextInt(), sc.nextInt()); //Weight and Value
        }

        dpSolution(items, weight);
    }

    private static void dpSolution(Item[] items, int weight) {
        int[][] dp = new int[items.length][weight + 1];

        //Initialize "no items" row
        for(int w = 0; w <= weight; w++) {
            dp[0][w] = 0;
        }

        //Initialize "no weight" row
        for(int i = 1; i < items.length; i++) {
            dp[i][0] = 0;
        }

        for(int i = 1; i < items.length; i++) {
            for(int w = 0; w <= weight; w++) {
                Item item = items[i];
                int prevValue = dp[i - 1][w];

                if(item.getWeight() <= w) {
                    int newValue = item.getValue() + dp[i - 1][w - item.getWeight()];

                    if(newValue > prevValue) {
                        dp[i][w] = newValue;
                    } else {
                        dp[i][w] = prevValue;
                    }
                } else {
                    dp[i][w] = prevValue;
                }
            }
        }

        System.out.println("Solution is: " + dp[items.length - 1][weight]);
    }
}
