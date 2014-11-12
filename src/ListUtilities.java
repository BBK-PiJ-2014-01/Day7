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

    static public IntInListDL arrayToListDL(int[] intArray){
        IntInListDL listStart = new IntInListDL(intArray[0]);
        for (int i = 1; i < intArray.length; i++) {
            IntInListDL newItem = new IntInListDL(intArray[i]);
            listStart.addIntDL(newItem);
        }
        return(listStart);
    }

    static long bubbleSort(IntInListDL myIntList) {
        long startTime = System.currentTimeMillis();
        int swapCounter = 1;
        int tempNumber = 0;
        while (swapCounter != 0){
            IntInListDL current = myIntList;
            swapCounter = 0;
            while (current.getNextIntInListDL() != null) {
                if (current.getNumber() > current.getNextIntInListDL().getNumber()) {
                    tempNumber = current.getNumber();
                    current.setNumber(current.getNextIntInListDL().getNumber());
                    current.getNextIntInListDL().setNumber(tempNumber);
                    swapCounter++;
                }
                current = current.getNextIntInListDL();
            }
        }
        long stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }

    static long cocktailSort(IntInListDL myIntList) {
        long startTime = System.currentTimeMillis();
        int swapCounter = 1;
        int tempNumber = 0;
        while (swapCounter != 0){
            IntInListDL current = myIntList;
            swapCounter = 0;
            while (current.getNextIntInListDL() != null) {
                if (current.getNumber() > current.getNextIntInListDL().getNumber()) {
                    tempNumber = current.getNumber();
                    current.setNumber(current.getNextIntInListDL().getNumber());
                    current.getNextIntInListDL().setNumber(tempNumber);
                    swapCounter++;
                }
                current = current.getNextIntInListDL();
            }
            while (current.getPreviousIntInListDL() != null) {
                if (current.getNumber() < current.getPreviousIntInListDL().getNumber()) {
                    tempNumber = current.getNumber();
                    current.setNumber(current.getPreviousIntInListDL().getNumber());
                    current.getPreviousIntInListDL().setNumber(tempNumber);
                    swapCounter++;
                }
                current=current.getPreviousIntInListDL();
            }
        }
        long stopTime = System.currentTimeMillis();
        return(stopTime-startTime);
    }
}
