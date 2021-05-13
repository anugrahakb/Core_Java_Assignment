package Question_8;
import java.util.Arrays;
import java.util.Scanner;

public class bubblesort
{

    void bubbleSort(int arr[])

    {

        int n = arr.length;

        for (int i = 0; i < n-1; i++)

            for (int j = 0; j < n-i-1; j++)

                if (arr[j] > arr[j+1])

                {

                    // swap temp and arr[i]

                    int temp = arr[j];

                    arr[j] = arr[j+1];

                    arr[j+1] = temp;

                }

    }
 

    /* Prints the array */

    void printArray(int arr[])

    {

        int n = arr.length;

        for (int i=0; i<n; ++i)

            System.out.print(arr[i] + " ");

        System.out.println();

    }
 

    // Driver method to test above

    public static void main(String args[])

    {

        bubblesort ob = new bubblesort();

        int arr[] = {5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};

        ob.bubbleSort(arr);

        System.out.println("Sorted array");

        ob.printArray(arr);

    }
}

