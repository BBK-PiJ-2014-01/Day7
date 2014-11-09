/**
 * Created by PierreM on 09/11/2014.
 */
public class IntInList {

    private int number;
    private IntInList nextIntInList;

    public IntInList(int number) {
        this.number = number;
        nextIntInList = null;
    }

    public void addInt(IntInList newInt) {
        if (this.nextIntInList == null)
            this.nextIntInList = newInt;
        else
            this.nextIntInList.addInt(newInt);
    }

    public void addIntSorted(IntInList newInt) {
        if (newInt.number >= this.number) {
            if (this.nextIntInList == null)
                this.nextIntInList = newInt;
            else
                this.nextIntInList.addIntSorted(newInt);
        } else {
            int tempInt = this.number;
            IntInList tempIntInList = this.nextIntInList;
            this.number = newInt.number;
            newInt.number = tempInt;
            this.nextIntInList = newInt;
            newInt.nextIntInList = tempIntInList;
        }
    }

    public boolean swap() {
        boolean swapCount = false;
        if (this.nextIntInList != null)
            if (this.number > this.nextIntInList.number) {
                int tempNumber = this.number;
                this.number = this.nextIntInList.number;
                this.nextIntInList.number = tempNumber;
                this.nextIntInList.swap();
            }
        return(swapCount);
    }

    public void printIntList() {
        System.out.print(this.number + ", ");
        if (this.nextIntInList != null)
            this.nextIntInList.printIntList();
        else
            System.out.println("END OF LIST");
    }

    public int intListLength() {
        IntInList tempIntInList = this;
        int counter = 1;
        while (tempIntInList.nextIntInList != null) {
            counter++;
            tempIntInList = tempIntInList.nextIntInList;
        }
        return(counter);
    }
}

