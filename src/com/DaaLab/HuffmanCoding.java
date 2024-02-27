package com.DaaLab;

/*
Enter the number of characters: 5
Enter characters and their frequencies:
R 7
A 8
J 11
A 15
N 9
N: 00
J: 01
R: 100
A: 101
A: 11
Execution time: 22 milliseconds

 */
import java.util.PriorityQueue;
import java.util.Scanner;

class HuffmanNode implements Comparable<HuffmanNode> {
    char data;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(char data, int frequency) {
        this.data = data;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        return this.frequency - other.frequency;
    }
}

public class HuffmanCoding {

    public static HuffmanNode buildHuffmanTree(char[] characters, int[] frequencies) {
        PriorityQueue<HuffmanNode> minHeap = new PriorityQueue<>();

        // Create a min priority queue with initial nodes
        for (int i = 0; i < characters.length; i++) {
            minHeap.offer(new HuffmanNode(characters[i], frequencies[i]));
        }

        // Build Huffman tree
        while (minHeap.size() > 1) {
            HuffmanNode left = minHeap.poll();
            HuffmanNode right = minHeap.poll();

            assert right != null;
            HuffmanNode mergedNode = new HuffmanNode('\0', left.frequency + right.frequency);
            mergedNode.left = left;
            mergedNode.right = right;

            minHeap.offer(mergedNode);
        }

        return minHeap.poll();
    }

    public static void printHuffmanCodes(HuffmanNode root, String code) {
        if (root == null) {
            return;
        }

        if (root.data != '\0') {
            System.out.println(root.data + ": " + code);
        }

        printHuffmanCodes(root.left, code + "0");
        printHuffmanCodes(root.right, code + "1");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of characters: ");
        int n = scanner.nextInt();
        char[] characters = new char[n];
        int[] frequencies = new int[n];
        System.out.println("Enter characters and their frequencies:");
        for (int i = 0; i < n; i++) {
            characters[i] = scanner.next().charAt(0);
            frequencies[i] = scanner.nextInt();
        }

        // Measure execution time
        long startTime = System.currentTimeMillis();

        // Build Huffman tree
        HuffmanNode root = buildHuffmanTree(characters, frequencies);

        // Print Huffman codes
        printHuffmanCodes(root, "");

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time: " + (endTime - startTime) + " milliseconds");

        scanner.close();
    }
}
