/**
 * Created by Pierre on 07/11/2014.
 */
public class SortedList {

    static public void main(String[] args) {
        SortedList sl = new SortedList();
        sl.run();
    }

    public void run() {
        int[] intArray = {1,1,2,3,5,8,13,21,34,55};
        IntList myIntList = ListUtilities.arrayToList(intArray);
        myIntList.printIntList();
        System.out.println("Length: "+myIntList.intListLength());
    }
}