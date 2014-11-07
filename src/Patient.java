/**
 * Created by Pierre on 05/11/2014.
 */
public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    public void addPatient(Patient newPatient) {
        if (this.nextPatient == null)
            this.nextPatient = newPatient;
        else
            this.nextPatient.addPatient(newPatient);
    }

    public boolean deletePatient(Patient oldPatient) {
        if (this.nextPatient == null)
                return(false);
        else
            if (this.nextPatient.name.equals(oldPatient.name)){
                this.nextPatient = nextPatient.nextPatient;
                return(true);
            } else
                return(this.nextPatient.deletePatient(oldPatient));
    }

    public void printPatientList() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Illness: " + this.illness);
        if (this.nextPatient != null)
            this.nextPatient.printPatientList();
        else
            System.out.println("END OF LIST");
    }

    public int patientListLengthIterative() {
        Patient tempPatient = this;
        int counter = 1;
        while (tempPatient.nextPatient != null) {
            counter++;
            tempPatient = tempPatient.nextPatient;
        }
        return (counter);
    }

    public int patientListLengthRecursive() {
        int counter = 1;
        if (this.nextPatient == null)
            return(1);
        else {
            counter = counter + this.nextPatient.patientListLengthRecursive();
            return (counter);
        }
    }
}
