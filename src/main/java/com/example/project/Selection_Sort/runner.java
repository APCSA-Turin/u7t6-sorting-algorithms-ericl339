package com.example.project.Selection_Sort;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class runner {
    public static void main(String[] args) {
        int[] arr = {1, 10, 7, 3, 5, 2, 4, 9, 6, 8};
        System.out.println(SelectionSort.selectionSort(arr));
    }
}