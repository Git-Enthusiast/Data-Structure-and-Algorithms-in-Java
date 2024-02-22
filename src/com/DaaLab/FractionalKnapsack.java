package com.DaaLab;

import java.util.Arrays;

class Item implements Comparable<Item> {
    int weight;
    int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    // Compare items based on value-to-weight ratio in descending order
    public int compareTo(Item other) {
        double ratio1 = (double) this.value / this.weight;
        double ratio2 = (double) other.value / other.weight;
        return Double.compare(ratio2, ratio1);
    }
}

public class FractionalKnapsack {

    public static double fractionalKnapsack(int capacity, Item[] items) {
        Arrays.sort(items);

        double totalValue = 0;
        double currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= capacity) {
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                double remainingCapacity = capacity - currentWeight;
                totalValue += item.value * (remainingCapacity / item.weight);
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        // Generate a big dataset (random weights and values)
        int dataSize = 100000;
        Item[] items = new Item[dataSize];
        for (int i = 0; i < dataSize; i++) {
            items[i] = new Item((int) (Math.random() * 100) + 1, (int) (Math.random() * 100) + 1);
        }

        // Set knapsack capacity
        int capacity = 500;

        // Measure execution time
        long startTime = System.currentTimeMillis();
        double result = fractionalKnapsack(capacity, items);
        long endTime = System.currentTimeMillis();

        System.out.println("Maximum value in knapsack: " + result);
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");
    }
}

