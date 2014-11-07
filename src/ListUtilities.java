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
}
