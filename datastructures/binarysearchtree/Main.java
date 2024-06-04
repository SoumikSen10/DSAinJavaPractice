package datastructures.binarysearchtree;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        BinarySearchTree myBST =new BinarySearchTree();
        Scanner in=new Scanner(System.in);

        System.out.println("Enter no of elements in BST");
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            System.out.print("Enter node value:");
            int value = in.nextInt();
            if (myBST.insert(value))
                System.out.println(value + " inserted into BST");
            else
                System.out.println("Insertion not possible!");
        }

        System.out.print("Enter the number to be searched in BST:");
        int n=in.nextInt();
        if(myBST.contains(n))
            System.out.println(n+" is present in the BST");
        else
            System.out.println(n+" is not present in the BST");

        System.out.println("BFS traversal:"+myBST.BFS());
        System.out.println("BFS preorder traversal:"+myBST.DFSPreOrder());
        System.out.println("DFS postorder traversal:"+myBST.DFSPostOrder());
        System.out.println("DFS inorder traversal:"+myBST.DFSInOrder());
    }

}

/*
Enter the values:
47
21
76
18
27
52
82
 */