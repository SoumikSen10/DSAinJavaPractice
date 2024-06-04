package datastructures.linkedlist;

import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        LinkedList myLinkedList=new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.getLength();
        myLinkedList.printList();

        System.out.println("Removed : "+myLinkedList.removeLast().value);
        System.out.println("Removed : "+myLinkedList.removeLast().value);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.prepend(1);
        myLinkedList.printList();
        System.out.println("Removed : "+myLinkedList.removeFirst().value);
        myLinkedList.printList();
        myLinkedList.prepend(1);
        myLinkedList.printList();
        System.out.println("Enter the index to search node:");
        int index=in.nextInt();
        System.out.println("Value at position "+index+" is : "+myLinkedList.get(index).value);
        System.out.println("Enter the index and value to be set:");
        int index1=in.nextInt();
        int val=in.nextInt();
        boolean check=myLinkedList.set(index1,val);
        if(check)
         myLinkedList.printList();
        else
            System.out.println("Could not set value due to out of range index");
        System.out.println("Enter the index and value to be inserted:");
        int index2=in.nextInt();
        int val1=in.nextInt();
        boolean check1=myLinkedList.insert(index2,val1);
        if(check1)
            myLinkedList.printList();
        else
            System.out.println("Could not perform insertion due to invalid index");
        System.out.println("Enter the index whose data is to be removed:");
        int index3=in.nextInt();

        System.out.println("Removed :"+myLinkedList.remove(index3).value);
        myLinkedList.printList();

        myLinkedList.reverse();
        System.out.println("Reversed linked list is:");
        myLinkedList.printList();
    }
}
