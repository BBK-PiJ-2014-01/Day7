/**
 * Created by PierreM on 08/11/2014.
 */
public class Sort {
    static public void main(String[] args) {
        Sort s = new Sort();
        s.run();
    }

    public void run() {
        int[] intArray = {55,1,2,21,5,8,13,60,34,1};
        IntList myIntList = ListUtilities.arrayToList(intArray);
        myIntList.printIntList();
        // ListUtilities.bubbleSort(myIntList);
        myIntList.printIntList();
    }
}
