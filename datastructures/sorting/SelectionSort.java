package datastructures.sorting;

import java.util.Arrays;

public class SelectionSort
{
    public static void selectionSort(int arr[])
    {
        int temp,minIndex;
        for(int i=0;i<arr.length-1;i++)
        {
            minIndex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[j] < arr[minIndex])
                {
                    minIndex = j;
                }
            }
                if(minIndex!=i)
                {
                    temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }

        }
    }
    public static void main(String args[])
    {

        int arr[]={3,1,5,6,2,4};
        selectionSort(arr);
        System.out.println("Sorted array is: "+ Arrays.toString(arr));
    }
}
