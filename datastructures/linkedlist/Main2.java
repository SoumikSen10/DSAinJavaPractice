package datastructures.linkedlist;

import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        DoublyLinkedList myDLL =new DoublyLinkedList(4);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.printList();

        myDLL.append(5);
        myDLL.printList();

        System.out.println("Removed last :"+myDLL.removeLast().value);
//        System.out.println("Removed last :"+myDLL.removeLast().value);
//        System.out.println("Removed last :"+myDLL.removeLast());

        myDLL.prepend(3);
        myDLL.prepend(2);
        myDLL.prepend(1);
        myDLL.printList();

        System.out.println("Removed first :"+myDLL.removeFirst().value);
        myDLL.printList();

        System.out.println("Enter the index whose node value you want:");
        int index=in.nextInt();
        System.out.println("Node value is: "+myDLL.get(index).value);

        System.out.println("Enter the index and value to be set:");
        int index1=in.nextInt();
        int value1=in.nextInt();
        boolean check=myDLL.set(index1,value1);
        if(check)
        {
            myDLL.printList();
        }
        else
        {
            System.out.println("Could not set value due to invalid index");
        }

        System.out.println("Enter the index and value to be inserted:");
        int index2=in.nextInt();
        int value2=in.nextInt();
        boolean check1=myDLL.insert(index2,value2);
        if(check1)
        {
            myDLL.printList();
        }
        else
        {
            System.out.println("Could not insert value due to invalid index");
        }

        System.out.println("Enter index to be removed: ");
        int index3=in.nextInt();
        System.out.println("Element removed: "+myDLL.remove(index3).value);
        myDLL.printList();
    }
}
