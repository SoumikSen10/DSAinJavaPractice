package datastructures.sorting;

import java.util.Arrays;

public class InsertionSort
{
    public static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>-1 && key<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String args[])
    {

        int arr[]={3,1,5,6,2,4,7};
        insertionSort(arr);
        System.out.println("Sorted array is: "+ Arrays.toString(arr));
    }
}
