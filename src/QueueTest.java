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
        IntInList int1 = new IntInList(34);
        myQueue.insert(int1);
        //IntInList int2 = new IntInList(12);
        //myQueue.insert(int2);
        System.out.println(myQueue.size());
    }

}
