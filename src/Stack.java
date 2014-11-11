/**
 * Created by PierreM on 10/11/2014.
 */
public class Stack {
    private IntInList headStack;
    private int listCount;

    public Stack() {
        this.headStack = null;
        this.listCount = 0;
    }

    public void push(IntInList newInt) {
        if (this.headStack == null)
            this.headStack = newInt;
        else {
            IntInList tempIntInList = this.headStack;
            this.headStack = newInt;
            newInt.setNextIntInList(tempIntInList);
        }
        listCount++;
    }

    public IntInList pop() {
        IntInList topIntInList = this.headStack;
        this.headStack = this.headStack.getNextIntInList();
        listCount--;
        return(topIntInList);
    }

    public boolean empty() {
        return((listCount == 0) ? true : false);
    }
}
