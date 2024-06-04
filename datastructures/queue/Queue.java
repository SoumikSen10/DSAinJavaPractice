package datastructures.queue;

public class Queue
{
    private Node first;
    private Node last;
    private int length;

    class Node
    {
        int value;
        Node next;
        Node(int value)
        {
            this.value=value;
        }
    }

    public Queue(int value)
    {
        Node newNode=new Node(value);
        first=newNode;
        last=newNode;
        length=1;
    }

    public void getFirst()
    {
        System.out.println("The first element is: "+first.value);
    }

    public void getLast()
    {
        System.out.println("The last element is: "+last.value);
    }

    public void getLength()
    {
        System.out.println("The length of queue is: "+length);
    }

    public void printQueue()
    {
        System.out.print("The queue elements are :");
        Node temp=first;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void enqueue(int value)
    {
        Node newNode=new Node(value);
        if(length==0)
        {
            first=newNode;
            last=newNode;
        }
        else
        {
            last.next=newNode;
            last=newNode;
        }
        System.out.println("Enqueued "+value+" into the queue");
        length++;
    }

    public Node dequeue()
    {
        if(length==0)
            return null;
        Node temp=first;
        if(length==1)
        {
            first=null;
            last=null;
        }
        else
        {
            first=first.next;
            temp.next=null;
        }
        length--;
        return temp;
    }
}
