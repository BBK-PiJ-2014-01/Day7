/**
 * Created by Pierre on 07/11/2014.
 */
public class IntList{
    private int number;
    private IntList nextIntList;

    public IntList(int number) {
        this.number = number;
        nextIntList = null;
    }

    public void addInt(IntList newInt) {
        if (this.nextIntList == null)
            this.nextIntList = newInt;
        else
            this.nextIntList.addInt(newInt);
    }

    public void printIntList() {
        System.out.print(this.number + ", ");
        if (this.nextIntList != null)
            this.nextIntList.printIntList();
        else
            System.out.println("END OF LIST");
    }

    public int intListLength() {
        IntList tempIntList = this;
        int counter = 1;
        while (tempIntList.nextIntList != null) {
            counter++;
            tempIntList = tempIntList.nextIntList;
        }
        return(counter);
    }


}
