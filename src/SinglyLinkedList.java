/**
 * Created by Pierre on 05/11/2014.
 */
public class SinglyLinkedList {
    private Patient patientListStart = null;

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.run();
    }

    private void run() {
        // Creating a linked list with 10 patients
        Patient p1 = new Patient("Pierre",32,"Flu");
        patientListStart = p1;
        Patient p2 = new Patient("Joe",22,"Flu");
        patientListStart.addPatient(p2);
        Patient p3 = new Patient("Dan",41,"Cold");
        patientListStart.addPatient(p3);
        Patient p4 = new Patient("Sarah",12,"Flu");
        patientListStart.addPatient(p4);
        Patient p5 = new Patient("Bill",18,"Flu");
        patientListStart.addPatient(p5);
        Patient p6 = new Patient("Jessica",28,"Flu");
        patientListStart.addPatient(p6);
        Patient p7 = new Patient("David",47,"Cold");
        patientListStart.addPatient(p7);
        Patient p8 = new Patient("Greg",62,"Flu");
        patientListStart.addPatient(p8);
        Patient p9 = new Patient("John",75,"Flu");
        patientListStart.addPatient(p9);
        Patient p10 = new Patient("Jill",2,"Flu");
        patientListStart.addPatient(p10);
        // Printing out the content of each element of the list
        patientListStart.printPatientList();
        // Removing 3 patients and checking they are not in the list anymore
        patientListStart.deletePatient(p2);
        patientListStart.deletePatient(p5);
        patientListStart.deletePatient(p9);
        patientListStart.printPatientList();
    }
}
