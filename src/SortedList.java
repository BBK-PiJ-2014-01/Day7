/**
 * Created by Pierre on 07/11/2014.
 */
public class SortedList {

    static public void main(String[] args) {
        SortedList sl = new SortedList();
        sl.run();
    }

    public void run() {
        IntInList newInt1 = new IntInList(5);
        IntInList myIntList = newInt1;
        IntInList newInt2 = new IntInList(3);
        myIntList.addIntSorted(newInt2);
        IntInList newInt3 = new IntInList(34);
        myIntList.addIntSorted(newInt3);
        IntInList newInt4 = new IntInList(12);
        myIntList.addIntSorted(newInt4);
        IntInList newInt5 = new IntInList(1);
        myIntList.addIntSorted(newInt5);
        IntInList newInt6 = new IntInList(3);
        myIntList.addIntSorted(newInt6);
        IntInList newInt7 = new IntInList(35);
        myIntList.addIntSorted(newInt7);
        IntInList newInt8 = new IntInList(12);
        myIntList.addIntSorted(newInt8);
        IntInList newInt9 = new IntInList(1);
        myIntList.addIntSorted(newInt9);
        IntInList newInt10 = new IntInList(9);
        myIntList.addIntSorted(newInt10);
        IntInList newInt11 = new IntInList(42);
        myIntList.addIntSorted(newInt11);
        IntInList newInt12 = new IntInList(11);
        myIntList.addIntSorted(newInt12);
        IntInList newInt13 = new IntInList(2);
        myIntList.addIntSorted(newInt13);
        IntInList newInt14 = new IntInList(1);
        myIntList.addIntSorted(newInt14);
        myIntList.printIntList();
        System.out.println("Length: "+myIntList.intListLength());
    }
}