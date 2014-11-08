/**
 * Created by Pierre on 07/11/2014.
 */
public class SortedList {

    static public void main(String[] args) {
        SortedList sl = new SortedList();
        sl.run();
    }

    public void run() {
        IntList newInt1 = new IntList(5);
        IntList myIntList = newInt1;
        IntList newInt2 = new IntList(3);
        myIntList.addIntSorted(newInt2);
        IntList newInt3 = new IntList(34);
        myIntList.addIntSorted(newInt3);
        IntList newInt4 = new IntList(12);
        myIntList.addIntSorted(newInt4);
        IntList newInt5 = new IntList(1);
        myIntList.addIntSorted(newInt5);
        myIntList.printIntList();
        System.out.println("Length: "+myIntList.intListLength());
    }
}