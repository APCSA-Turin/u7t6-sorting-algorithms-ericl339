package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSort {

    // PART A. implementing insertion sort
    public static int[] insertionSort(int[] elements) {
        int count = 0;
        int j;
        int temp;
        for (int i = 1; i < elements.length; i ++) {
            temp = i;
            j = i - 1;
            if (i == elements.length) {
                break;
            }
            while (elements[j] > elements[i]) {
                count ++;
                int temp1 = elements[j];
                elements[j] = elements[i];
                elements[i] = temp1;
                i = j;
                if (j == 0) {
                    break;
                }
                j --;
            }
            i = temp;
        }
        System.out.println("Insertion count: "+ count);
        return elements;
    }

   
    public static void selectionSort(int[] elements) {
        int count = 0;
        int minIndex = 0;
        int temp;
        for (int i = 0; i < elements.length; i ++) {
            minIndex = i;
            for (int j = i; j < elements.length; j ++) {
                count ++;
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            temp = elements[i];
            elements[i] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("Selection count: "+ count);
    }

    // PART B. sorting a 1000-word list
    public static ArrayList<String> insertionSortWordList(ArrayList<String> words) {
        int count = 0;
        int j;
        int temp;
        for (int i = 1; i < words.size(); i ++) {
            temp = i;
            j = i - 1;
            if (i == words.size()) {
                break;
            }
            while (words.get(j).compareTo(words.get(i)) > 0) {
                count ++;
                String temp1 = words.get(j);
                words.set(j, words.get(i));
                words.set(i, temp1);
                i = j;
                if (j == 0) {
                    break;
                }
                j --;
            }
            i = temp;
        }
        System.out.println("Insertion count: "+ count);
        return words;
    }

    public static void selectionSortWordList(ArrayList<String> words) {
        int count = 0;
        int minIndex = 0;
        String temp;
        for (int i = 0; i < words.size(); i ++) {
            minIndex = i;
            for (int j = i; j < words.size(); j ++) {
                count ++;
                if (words.get(j).compareTo(words.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            temp = words.get(i);
            words.set(i,words.get(minIndex));
            words.set(minIndex,temp);
            System.out.println("Selection count: "+ count);
        }
    }

    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        try {
            Scanner input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordList;
    }


}