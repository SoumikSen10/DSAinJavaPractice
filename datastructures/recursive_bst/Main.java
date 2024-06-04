package datastructures.recursive_bst;

import datastructures.binarysearchtree.BinarySearchTree;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        recursiveBST myBST =new recursiveBST();
        Scanner in=new Scanner(System.in);

        System.out.println("Enter no of elements in BST");
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.print("Enter node value:");
            int value = in.nextInt();
            myBST.rInsert(value);
        }

        System.out.print("Enter the number to be searched in BST:");
        int n=in.nextInt();
        if(myBST.rContains(n))
            System.out.println(n+" is present in the BST");
        else
            System.out.println(n+" is not present in the BST");

        System.out.println("Enter the node value to be deleted:");
        int d=in.nextInt();
        if(myBST.rContains(d))
        {
            myBST.deleteNode(d);
            System.out.println("Deleted");
        }
        else
        {
            System.out.println(d+" is not present in tree");
        }
    }
}

//Insert elements
/*
* 47
* 21
* 76
* 18
* 27
* 52
* 82
* */

//for deletion part execution. Insert 2,1,3 then try deleting 2