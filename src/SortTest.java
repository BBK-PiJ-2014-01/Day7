/**
 * Created by PierreM on 12/11/2014.
 */

import java.util.Random;

public class SortTest {

    public static void main(String[] args) {
        SortTest st = new SortTest();
        st.run();
    }

    public void run() {
        int[] intArray = new int[5000];
        Random random = new Random();
        for (int i = 0; i<5000; i++) {
            intArray[i] = random.nextInt(5000);
        }

        IntInListDL myIntList1 = ListUtilities.arrayToListDL(intArray);
        myIntList1.printIntList();
        long timeToBubbleSort = ListUtilities.bubbleSort(myIntList1);
        System.out.println("Time to sort with BubbleSort: "+timeToBubbleSort);
        myIntList1.printIntList();

        IntInListDL myIntList2 = ListUtilities.arrayToListDL(intArray);
        myIntList2.printIntList();
        long timeToCocktailSort = ListUtilities.cocktailSort(myIntList2);
        System.out.println("Time to sort with CocktailSort: "+timeToCocktailSort);
        myIntList2.printIntList();
/*
        IntInList myIntList3 = ListUtilities.arrayToList(intArray3);
        myIntList3.printIntList();
        long timeToQuickSort = ListUtilities.QuickSort(myIntList3);
        System.out.println("Time to sort with BubbleSort: "+timeToQuickSort);
        myIntList3.printIntList();
*/
    }
}
