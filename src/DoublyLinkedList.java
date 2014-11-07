/**
 * Created by Pierre on 05/11/2014.
 */
public class DoublyLinkedList {
    private PatientDL patientListStart = null;

    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.run();
    }

    private void run() {
        // Creating a linked list with 10 patients
        PatientDL p1 = new PatientDL("Pierre",32,"Flu");
        patientListStart = p1;
        PatientDL p2 = new PatientDL("Joe",22,"Flu");
        patientListStart.addPatient(p2);
        PatientDL p3 = new PatientDL("Dan",41,"Cold");
        patientListStart.addPatient(p3);
        PatientDL p4 = new PatientDL("Sarah",12,"Flu");
        patientListStart.addPatient(p4);
        PatientDL p5 = new PatientDL("Bill",18,"Flu");
        patientListStart.addPatient(p5);
        PatientDL p6 = new PatientDL("Jessica",28,"Flu");
        patientListStart.addPatient(p6);
        PatientDL p7 = new PatientDL("David",47,"Cold");
        patientListStart.addPatient(p7);
        PatientDL p8 = new PatientDL("Greg",62,"Flu");
        patientListStart.addPatient(p8);
        PatientDL p9 = new PatientDL("John",75,"Flu");
        patientListStart.addPatient(p9);
        PatientDL p10 = new PatientDL("Jill",2,"Flu");
        patientListStart.addPatient(p10);
        // Printing out the content of each element of the list
        patientListStart.printPatientList();
        System.out.println("Length: " + patientListStart.patientListLengthIterative());
        System.out.println("Length: " + patientListStart.patientListLengthRecursive());
        // Removing 4 patients, including the first element of the list and checking they are not in the list anymore
        p1 = null;
        patientListStart = p2;
        patientListStart.deletePatient(p3);
        patientListStart.deletePatient(p5);
        patientListStart.deletePatient(p9);
        patientListStart.printPatientList();
        System.out.println("Length: " + patientListStart.patientListLengthIterative());
        System.out.println("Length: " + patientListStart.patientListLengthRecursive());
    }
}