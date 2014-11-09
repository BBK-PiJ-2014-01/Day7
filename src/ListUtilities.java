import java.util.List;

/**
 * Created by Pierre on 07/11/2014.
 */
public class ListUtilities {

    static public IntInList arrayToList(int[] intArray){
        IntInList listStart = new IntInList(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            IntInList newItem = new IntInList(intArray[i]);
            listStart.addInt(newItem);
        }
        return(listStart);
    }
/*
    static long bubbleSort(IntInList myIntList) {
        long startTime = System.currentTimeMillis();
        int swapCounter = 0;
        IntInList tempInt = myIntList;
        do {
            while (myIntList.nextIntList != null)

        } while (swapCounter != 0);
        long stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }
*/
}
