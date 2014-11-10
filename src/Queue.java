/**
 * Created by PierreM on 09/11/2014.
 */
public class Queue {
    private IntInList headQueue;

    public Queue() {
        this.headQueue = null;
    }

    public void insert(IntInList newInt) {
        if (this.headQueue == null)
            this.headQueue = newInt;
        else {
            if (this.headQueue.getNextIntInList() == null)
                this.headQueue.setNextIntInList(newInt);
            else
                this.headQueue.getNextIntInList().addInt(newInt);
        }
    }

    public IntInList retrieve() {
        IntInList oldestIntInList = this.headQueue;
        this.headQueue = this.headQueue.getNextIntInList();
        return(oldestIntInList);
    }

    public int size() {
        if (headQueue == null)
            return(0);
        else
            return(this.headQueue.intListLength());
    }
}
