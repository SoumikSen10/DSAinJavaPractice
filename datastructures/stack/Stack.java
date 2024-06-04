package datastructures.stack;

public class Stack
{
    private Node top;
    private int height;

    class Node
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value=value;
        }
    }

    public Stack(int value)
    {
        Node newNode=new Node(value);
        top=newNode;
        height=1;
    }

    public void printStack()
    {
        System.out.print("The elements in the stack are: ");
        Node temp=top;
        while(temp!=null)
        {
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void getTop()
    {
        System.out.println("The topmost element of the stack is : "+top.value);
    }

    public void getHeight()
    {
        System.out.println("The height of the stack is : "+height);
    }

    public void push(int value)
    {
        Node newNode=new Node(value);
        if(height==0)
        {
            top=newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }
        System.out.println("Pushed "+value+" into stack.");
        height++;
    }

    public Node pop()
    {
        if(height==0)
            return null;
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }

}
