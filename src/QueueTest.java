/**
 * Created by PierreM on 09/11/2014.
 */
public class QueueTest {

    static public void main(String[] args) {
        QueueTest q = new QueueTest();
        q.run();
    }

    public void run() {
        Queue myQueue = new Queue();
        System.out.println("There are "+myQueue.size()+" requests in the queue");
        IntInList int1 = new IntInList(5);
        System.out.println("Inserting request "+int1.getNumber()+"...");
        myQueue.insert(int1);
        IntInList int2 = new IntInList(8);
        System.out.println("Inserting request "+int2.getNumber()+"...");
        myQueue.insert(int2);
        IntInList int3 = new IntInList(12);
        System.out.println("Inserting request "+int3.getNumber()+"...");
        myQueue.insert(int3);
        System.out.println("There are "+myQueue.size()+" requests in the queue");
        System.out.println("Retrieving request "+myQueue.retrieve().getNumber()+"... done");
        IntInList int4 = new IntInList(13);
        System.out.println("Inserting request "+int4.getNumber()+"...");
        myQueue.insert(int4);
        System.out.println("There are "+myQueue.size()+" requests in the queue");
        System.out.println("Retrieving request "+myQueue.retrieve().getNumber()+"... done");
        System.out.println("Retrieving request "+myQueue.retrieve().getNumber()+"... done");
        System.out.println("There are "+myQueue.size()+" requests in the queue");
        System.out.println("Retrieving request "+myQueue.retrieve().getNumber()+"... done");
        System.out.println("There are "+myQueue.size()+" requests in the queue");
    }
}
