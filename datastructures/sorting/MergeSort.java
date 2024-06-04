package datastructures.sorting;

import java.util.Arrays;

public class MergeSort
{
    public static int[] merge(int arr1[],int arr2[])
    {
       int combined[]=new int[arr1.length+arr2.length];
       int i=0,j=0,index=0;
       while(i<arr1.length && j<arr2.length)
       {
           if(arr1[i]<arr2[j])
           {
               combined[index]=arr1[i];
               i++;
               index++;
           }
           else
           {
               combined[index]=arr2[j];
               j++;
               index++;
           }
       }

       while(i<arr1.length)
       {
           combined[index]=arr1[i];
           i++;
           index++;
       }

       while(j<arr2.length)
       {
           combined[index]=arr2[j];
           j++;
           index++;
       }

       return combined;
    }

    public static int[] mergeSort(int arr[])
    {
        if(arr.length==1)
            return arr;

        int midIndex=arr.length/2;

        int left[]=mergeSort(Arrays.copyOfRange(arr,0,midIndex));
        int right[]=mergeSort(Arrays.copyOfRange(arr,midIndex,arr.length));

        return merge(left,right);

    }

    public static void main(String[] args)
    {
        int arr[]={3,1,5,6,2,4};
        int sorted[]=mergeSort(arr);
        System.out.println("Original array is: "+Arrays.toString(arr));
        System.out.println("Sorted array is: "+ Arrays.toString(sorted));
    }
}
