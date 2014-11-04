/**
 * Created by Pierre on 04/11/2014.
 */
public class Spy {
    static private int spyCount = 0;
    private int spyID;

    public Spy(int newSpyID) {
        this.spyID = newSpyID;
        spyCount++;
        System.out.println("Last spy ID: "+newSpyID);
        System.out.println("Number of spies so far: "+spyCount);
    }

    public void die() {
        spyCount--;
        System.out.println("Spy " + this.spyID + " has been detected and eliminated");
        System.out.println("Number of spies so far: " + spyCount);
    }

    static public void main (String[] args) {
        Spy p1 = new Spy(1);
        Spy p2 = new Spy(2);
        Spy p3 = new Spy(3);
        Spy p4 = new Spy(4);
        p2.die();
        p4.die();
    }
}
