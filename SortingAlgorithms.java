/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Random;

/**
 *
 * @author cswan
 */
public class SortingAlgorithms
{

    static final int arraySize = 5;
    static final int maxValue = 50;
    static final int MAX = 32767;

    static int[] dataArray = new int[arraySize];

    public static void main(String[] args)
    {
//        // Bubble sort
//        generateData(maxValue);
//        printArrayContents("\nUnsorted		");
//
//        System.out.println("Sorting...");
//        bubbleSort();
//        printArrayContents("Bubble			");
//
//        // Bubble sort optimised
//        generateData(maxValue);
//        printArrayContents("\nUnsorted		");
//
//        System.out.println("Sorting...");
//        bubbleSort_opt();
//        printArrayContents("Bubble opt		");
//
//        // Cocktail Shaker sort
//        generateData(maxValue);
//        printArrayContents("\nUnsorted		");
//
//        System.out.println("Sorting...");
//        shakerSort();
//        printArrayContents("Shaker			");
//
//        // Cocktail Shaker sort optimised
//        generateData(maxValue);
//        printArrayContents("\nUnsorted		");
//
//        System.out.println("Sorting...");
//        shakerSort_opt();
//        printArrayContents("Shaker opt		");
//
//        // Shuttle sort optimised
//        generateData(maxValue);
//        printArrayContents("\nUnsorted		");
//
//        System.out.println("Sorting...");
//        shuttleSort();
//        printArrayContents("Shuttle			");
//
//        // Selection sort
//        generateData(maxValue);
//        printArrayContents("\nUnsorted		");
//
//        System.out.println("Sorting...");
//        selectionSort();
//        printArrayContents("Selection		");

        // Insertion sort
        generateData(maxValue);
        printArrayContents("\nUnsorted		");

        System.out.println("Sorting...");
        insertionSort();
        printArrayContents("Insertion		");
    }

    static void generateData(int maxDataValue)
    {
        Random randomGenerator = new Random();

        for (int i = 0; i < arraySize; i++)
        {
            dataArray[i] = randomGenerator.nextInt(maxDataValue);
        }
    }

    static void printArrayContents(String labelText)
    {
        System.out.print(labelText + " Array contents : { ");

        for (int i = 0; i < arraySize; i++)
        {
            System.out.printf("%2d ", dataArray[i]);
        }

        System.out.println("}");
    }

    static void swap(int[] a, int k, int l)
    {
        int temp = a[k];
        a[k] = a[l];
        a[l] = temp;
    }

    // SORTING ALGORITHMS ###########################
    // bubble Sort
    static void bubbleSort()
    {
        // YOUR CODE GOES HERE
    }

    // bubble Sort optimized
    static void bubbleSort_opt()
    {
        // YOUR CODE GOES HERE
    }

    // CocktailShaker Sort
    static void shakerSort()
    {
        // YOUR CODE GOES HERE
    }

    // CocktailShaker Sort optimized
    static void shakerSort_opt()
    {
        // YOUR CODE GOES HERE
    }

    // ShuttleShaker Sort
    static void shuttleSort()
    {
        // YOUR CODE GOES HERE
    }

    // Selection Sort
    static void selectionSort()
    {
        int temp, min;
        for (int i = 0; i < dataArray.length; i++)
        {
            min = i;
            for (int j = i; j < dataArray.length; j++)
            {
                if (dataArray[j] < dataArray[min])
                {
                    min = j;
                }
            }
            //System.out.println("Min of this pass is: " + dataArray[min]);
            temp = dataArray[i];
            dataArray[i] = dataArray[min];
            dataArray[min] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort()
    {
        int num, j;
        for (int i = 1; i < dataArray.length; i++)
        {
            num = dataArray[i];           
            j = i - 1;
            
            System.out.println(dataArray[j]);
            while(j >= 0 && dataArray[j] > num)
            {
                dataArray[j + 1] = dataArray[j];
                j--;
            }  
            dataArray[j + 1] = num;         
        }
    }
    
}
