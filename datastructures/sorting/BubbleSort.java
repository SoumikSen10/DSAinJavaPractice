package datastructures.sorting;

import java.util.Arrays;

public class BubbleSort
{
    public static void bubbleSort(int arr[])
    {
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args)
    {
       int arr[]={3,1,5,6,2,4};
       bubbleSort(arr);
        System.out.println("Sorted array is: "+ Arrays.toString(arr));
    }
}
