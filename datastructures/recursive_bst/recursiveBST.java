package datastructures.recursive_bst;

import datastructures.binarysearchtree.BinarySearchTree;

public class recursiveBST
{

    private Node root;
    class Node
    {
        int value;
        Node left;
        Node right;

        public Node(int value)
        {
            this.value=value;
        }
    }

    private Node rInsert(Node currentNode,int value)
    {
        Node newNode=new Node(value);
        if(currentNode==null)
            return newNode;
        if(value<currentNode.value)
        {
            rInsert(currentNode.left,value);
        }
        else if(value>currentNode.value)
        {
            rInsert(currentNode.right,value);
        }
        return currentNode;

    }

    public void rInsert(int value)
    {
        if(root==null)
            root=new Node(value);
        rInsert(root,value);
    }

    private boolean rContains(Node currentNode,int value)
    {
       if(currentNode==null)
           return false;
       if(currentNode.value==value)
           return true;
       if(value<currentNode.value)
           return rContains(currentNode.left,value);
       else
           return rContains(currentNode.right,value);
    }

    public boolean rContains(int value)
    {
         return rContains(root,value);
    }

    private Node deleteNode(Node currentNode,int value)
    {
        if(currentNode==null)
            return null;
        if(value<currentNode.value)
            currentNode.left=deleteNode(currentNode.left,value);
        else if(value>currentNode.value)
            currentNode.right=deleteNode(currentNode.right,value);
        else
        {
            //conditions if node is found
            if(currentNode.left==null && currentNode.right==null)
                return null;
            else if(currentNode.left==null)
                currentNode=currentNode.right;
            else if(currentNode.right==null)
                currentNode=currentNode.left;
            else
            {
                //when node to be deleted has left and right nodes or subtrees
                int subTreeMin=minValue(currentNode.right);
                currentNode.value=subTreeMin;
                currentNode.right=deleteNode(currentNode,subTreeMin);
            }
        }
        return currentNode;
    }

    private int minValue(Node currentNode)
    {
        while(currentNode.left!=null)
        {
            currentNode=currentNode.left;
        }
        return currentNode.value;
    }

    public void deleteNode(int val)
    {
        deleteNode(root,val);
    }
}
