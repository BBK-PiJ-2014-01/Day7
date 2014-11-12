/**
 * Created by PierreM on 12/11/2014.
 */
public class IntInListDL {
    private int number;
    private IntInListDL previousIntInListDL;
    private IntInListDL nextIntInListDL;

    public IntInListDL(int number) {
        this.number = number;
        previousIntInListDL = null;
        nextIntInListDL = null;
    }

    public int getNumber() {
        return(this.number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public IntInListDL getNextIntInListDL() {
        return(this.nextIntInListDL);
    }

    public IntInListDL getPreviousIntInListDL() {
        return(this.previousIntInListDL);
    }

    public void addIntDL(IntInListDL newInt) {
        if (this.nextIntInListDL == null) {
            this.nextIntInListDL = newInt;
            newInt.previousIntInListDL = this;
        } else
            this.nextIntInListDL.addIntDL(newInt);
    }

    public void printIntList() {
        System.out.print(this.number + ", ");
        if (this.nextIntInListDL != null)
            this.nextIntInListDL.printIntList();
        else
            System.out.println("END OF LIST");
    }

    public int intListLength() {
        IntInListDL tempIntInListDL = this;
        int counter = 1;
        while (tempIntInListDL.nextIntInListDL != null) {
            counter++;
            tempIntInListDL = tempIntInListDL.nextIntInListDL;
        }
        return(counter);
    }


}
