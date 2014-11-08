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
        IntList newInt6 = new IntList(3);
        myIntList.addIntSorted(newInt6);
        IntList newInt7 = new IntList(35);
        myIntList.addIntSorted(newInt7);
        IntList newInt8 = new IntList(12);
        myIntList.addIntSorted(newInt8);
        IntList newInt9 = new IntList(1);
        myIntList.addIntSorted(newInt9);
        IntList newInt10 = new IntList(9);
        myIntList.addIntSorted(newInt10);
        IntList newInt11 = new IntList(42);
        myIntList.addIntSorted(newInt11);
        IntList newInt12 = new IntList(11);
        myIntList.addIntSorted(newInt12);
        IntList newInt13 = new IntList(2);
        myIntList.addIntSorted(newInt13);
        IntList newInt14 = new IntList(1);
        myIntList.addIntSorted(newInt14);
        myIntList.printIntList();
        System.out.println("Length: "+myIntList.intListLength());
    }
}