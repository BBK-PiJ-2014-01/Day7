/**
 * Created by PierreM on 10/11/2014.
 */
public class StackTest {

    public static void main(String[] args) {
        StackTest s = new StackTest();
        s.run();
    }

    public void run() {
        Stack myStack = new Stack();
        String message = "";
        IntInList int1 = new IntInList(5);
        System.out.println("Pushing "+int1.getNumber()+"...");
        myStack.push(int1);
        IntInList int2 = new IntInList(8);
        System.out.println("Pushing "+int2.getNumber()+"...");
        myStack.push(int2);
        IntInList int3 = new IntInList(12);
        System.out.println("Pushing "+int3.getNumber()+"...");
        myStack.push(int3);
        System.out.println("Popping... it's a "+myStack.pop().getNumber());
        IntInList int4 = new IntInList(13);
        System.out.println("Pushing "+int4.getNumber()+"...");
        myStack.push(int4);
        System.out.println("Popping... it's a "+myStack.pop().getNumber());
        System.out.println("Popping... it's a "+myStack.pop().getNumber());
        System.out.println("Popping... it's a "+myStack.pop().getNumber());
        System.out.println(message = myStack.empty() ? "Stack is empty" : "Stack is not empty");
    }
}

