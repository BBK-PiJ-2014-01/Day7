import java.util.List;

/**
 * Created by Pierre on 07/11/2014.
 */
public class ListUtilities {

    static public IntList arrayToList(int[] intArray){
        IntList listStart = new IntList(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            IntList newItem = new IntList(intArray[i]);
            listStart.addInt(newItem);
        }
        return(listStart);
    }

    static long bubbleSort(IntList myIntList) {
        long startTime = System.currentTimeMillis();
        int swapCounter = 0;
        IntList tempInt = myIntList;
        do {
            while (myIntList.nextIntList != null)

        } while (swapCounter != 0);
        long stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }
}
