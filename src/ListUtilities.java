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

    static long bubbleSort(IntInList myIntList) {
        long startTime = System.currentTimeMillis();
        int swapCounter = 1;
        int tempNumber = 0;
        while (swapCounter != 0){
            IntInList current = myIntList;
            swapCounter = 0;
            while (current.getNextIntInList() != null) {
                if (current.getNumber() > current.getNextIntInList().getNumber()) {
                    tempNumber = current.getNumber();
                    current.setNumber(current.getNextIntInList().getNumber());
                    current.getNextIntInList().setNumber(tempNumber);
                    swapCounter++;
                }
                current = current.getNextIntInList();
            }
        }
        long stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }
}
