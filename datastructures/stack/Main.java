package datastructures.stack;

public class Main
{
    public static void main(String[] args)
    {
       Stack myStack=new Stack(4);

       myStack.getTop();
       myStack.getHeight();
       myStack.printStack();


       myStack.push(3);
       myStack.push(2);
       myStack.push(1);
       myStack.printStack();

       for(int i=0;i<4;i++) {
           int temp = myStack.pop().value;
           if (temp == 0) {
               System.out.println("Could not pop from stack since it is empty");
           } else {
               System.out.println("Popped out " + temp + " from stack.");
               myStack.printStack();
           }
       }
    }
}
