package datastructures.queue;

public class Main
{
    public static void main(String[] args)
    {
       Queue myQueue=new Queue(4);

       myQueue.getFirst();
       myQueue.getLast();
       myQueue.getLength();

       myQueue.printQueue();

       myQueue.enqueue(5);
       myQueue.enqueue(6);
       myQueue.enqueue(7);
       myQueue.printQueue();

        for(int i=0;i<4;i++) {
            int temp = myQueue.dequeue().value;
            if (temp == 0) {
                System.out.println("Could not dequeue from queue since it is empty");
            } else {
                System.out.println("Dequeued out " + temp + " from queue.");
                myQueue.printQueue();
            }
        }
    }
}
