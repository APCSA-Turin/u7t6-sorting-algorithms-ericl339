package com.example.project.Insertion_Sort;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
int[] arrA = {85,49,22,49,88,18,76,97,16,61,45,74,48,56,90,99,22,38,12,9,81,28,46,69,48,61,11,3,2,9,97,29,59,51,46,3,14,61,16,44,29,88,89,34,2,16,56,12,90,88};
InsertionSort.selectionSort(arrA);
System.out.println(Arrays.toString(arrA));
System.out.println();
int[] arrB = {85,49,22,49,88,18,76,97,16,61,45,74,48,56,90,99,22,38,12,9,81,28,46,69,48,61,11,3,2,9,97,29,59,51,46,3,14,61,16,44,29,88,89,34,2,16,56,12,90,88};
InsertionSort.insertionSort(arrB);
System.out.println(Arrays.toString(arrB));

    }
}