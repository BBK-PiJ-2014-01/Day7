/**
 * Created by PierreM on 12/11/2014.
 */
public class SortTest {

    public static void main(String[] args) {
        SortTest st = new SortTest();
        st.run();
    }

    public void run() {
        int[] intArray1 = {102, 1, 98, 34, 3, 5, 103, 28, 13, 21, 44,
                            7, 100, 21, 67, 2, 9, 94, 49, 76, 71, 43, 99,
                            23, 47, 34, 95, 4, 6, 11, 12, 54, 57, 59, 60};
        IntInList myIntList1 = ListUtilities.arrayToList(intArray1);
        long timeToSort = ListUtilities.bubbleSort(myIntList1);
        System.out.println("Time to sort with BubbleSort: "+timeToSort);
        myIntList1.printIntList();
    }
}
