/**
 * Created by PierreM on 09/11/2014.
 */
public class Queue {
    private IntInList headQueue;
    private IntInList tailQueue;

    public Queue() {
        this.headQueue = null;
        this.tailQueue = null;
    }

    public void insert(IntInList newInt) {
        // int tempInt = this.headQueue.getNumber();
        if (this.headQueue == null) {
            this.headQueue = newInt;
            this.tailQueue = newInt;
        } else {
            IntInList tempIntInList = this.headQueue.getNextIntInList();
            this.headQueue = newInt;
            // newInt.number = tempInt;
            // this.nextIntInList = newInt;
            newInt.setNextIntInList(tempIntInList);
        }
    }

    public IntInList retrieve() {
        IntInList lastIntInList = null;
        return(lastIntInList);
    }

    public int size() {
        if (headQueue == null)
            return(0);
        else
            return(this.headQueue.intListLength());
    }
}
