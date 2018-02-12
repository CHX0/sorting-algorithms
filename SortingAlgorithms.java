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

    static final int arraySize = 20;
    static final int maxValue = 50;
    static final int MAX = 32767;

    static int[] dataArray = new int[arraySize];

    public static void main(String[] args)
    {
        // Bubble sort
        generateData(maxValue);
        printArrayContents("\nUnsorted		");

        bubbleSort();
        printArrayContents("Bubble			");

        // Bubble sort optimised
        generateData(maxValue);
        printArrayContents("\nUnsorted		");

        bubbleSort_opt();
        printArrayContents("Bubble opt		");

        // Cocktail Shaker sort
        generateData(maxValue);
        printArrayContents("\nUnsorted		");

        System.out.println("Sorting...");
        shakerSort();
        printArrayContents("Shaker			");

        // Cocktail Shaker sort optimised
        generateData(maxValue);
        printArrayContents("\nUnsorted		");

        shakerSort_opt();
        printArrayContents("Shaker opt		");

        // Shuttle sort optimised
        generateData(maxValue);
        printArrayContents("\nUnsorted		");

        shuttleSort();
        printArrayContents("Shuttle			");

        // Selection sort
        generateData(maxValue);
        printArrayContents("\nUnsorted		");

        selectionSort();
        printArrayContents("Selection		");

        // Insertion sort
        generateData(maxValue);
        printArrayContents("\nUnsorted		");

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

    static void swap(int k, int l)
    {
        int temp = dataArray[k];
        dataArray[k] = dataArray[l];
        dataArray[l] = temp;
    }

    // SORTING ALGORITHMS ###########################
    // bubble Sort
    static void bubbleSort()
    {
        for (int i = 0; i < dataArray.length; i++)
        {
            for (int j = 0; j < dataArray.length - 1; j++)
            {
                if (dataArray[j + 1] < dataArray[j])
                {
                    swap(j, j + 1);
                }
            }
        }
    }

    // bubble Sort optimized
    static void bubbleSort_opt()
    {

        for (int i = 0; i < dataArray.length; i++)
        {
            for (int j = 0; j < dataArray.length - i - 1; j++)
            {
                if (dataArray[j + 1] < dataArray[j])
                {
                    swap(j, j + 1);
                }
            }
        }
    }

    // CocktailShaker Sort
    static void shakerSort()
    {
        for (int i = 0; i < dataArray.length / 2; i++)
        {
            for (int j = 0; j < dataArray.length - 1; j++)
            {
                if (dataArray[j] > dataArray[j + 1])
                {
                    swap(j, j + 1);
                }
            }

            for (int j = dataArray.length - 2; j > 0; j--)
            {
                if (dataArray[j] < dataArray[j - 1])
                {
                    swap(j, j - 1);
                }
            }
        }
    }

    // CocktailShaker Sort optimized
    static void shakerSort_opt()
    {
        for (int i = 0; i < dataArray.length / 2; i++)
        {
            for (int j = i; j < dataArray.length - i - 1; j++)
            {
                if (dataArray[j] > dataArray[j + 1])
                {
                    swap(j, j + 1);
                }
            }

            for (int j = dataArray.length - i - 2; j > i; j--)
            {
                if (dataArray[j] < dataArray[j - 1])
                {
                    swap(j, j - 1);
                }
            }
        }
    }

    // ShuttleShaker Sort
    static void shuttleSort()
    {
        for (int i = 1; i < dataArray.length - 1; i++)
        {
            if (dataArray[i] > dataArray[i + 1])
            {
                swap(i, i + 1);
                for (int j = i; j > 0; j--)
                {
                    if (dataArray[j] < dataArray[j - 1])
                    {
                        swap(j, j - 1);
                    }
                }
            }
        }
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
            swap(i, min);
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

            while (j >= 0 && dataArray[j] > num)
            {
                dataArray[j + 1] = dataArray[j];
                j--;
            }
            dataArray[j + 1] = num;
        }
    }

}
