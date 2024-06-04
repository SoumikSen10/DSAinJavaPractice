package datastructures.interview_questions;
import java.util.HashMap;
public class CommonInArray
{
    public static boolean itemInCommon(int arr1[],int arr2[])
    {
       HashMap<Integer,Boolean> myHashmap=new HashMap<>();

       for(int i:arr1)
       {
           myHashmap.put(i,true);
       }

       for(int i:arr2)
       {
           if(myHashmap.get(i)!=null)
               return true;
       }
       return false;
    }

    public static void main(String[] args)
    {
       int arr1[]={1,2,3,4,5};
       int arr2[]={6,7,8,9,5};
        System.out.println(itemInCommon(arr1,arr2));
    }
}
