package com.DaaLab;

/*
Enter the number of items: 5
Enter the values and weights of items:
15 2
10 3
9 3
20 4
18 6
Enter the capacity of the knapsack: 10
Execution time: 4500 nanoseconds
Maximum value in the knapsack: 48.0

 */
import java.util.*;

public class FractionalKnapsackUserInput {

    static class Item {
        int value;
        int weight;
        double valuePerWeight;

        public Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.valuePerWeight = (double) value / weight;
        }
    }

    public static double fractionalKnapsack(int capacity, Item[] items) {
        Arrays.sort(items, Comparator.comparingDouble(a -> -a.valuePerWeight));

        double totalValue = 0;
        int currentWeight = 0;

        long startTime = System.nanoTime();

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                int remainingCapacity = capacity - currentWeight;
                totalValue += item.valuePerWeight * remainingCapacity;
                break;
            }
        }

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Execution time: " + executionTime + " nanoseconds");

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = scanner.nextInt();
        Item[] items = new Item[n];
        System.out.println("Enter the values and weights of items:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            int weight = scanner.nextInt();
            items[i] = new Item(value, weight);
        }
        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();

        double maxValue = fractionalKnapsack(capacity, items);
        System.out.println("Maximum value in the knapsack: " + maxValue);

        scanner.close();
    }
}
