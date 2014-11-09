public class PatientDL {
    private String name;
    private int age;
    private String illness;
    private PatientDL previousPatient;
    private PatientDL nextPatient;

    public PatientDL(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.previousPatient = null;
        this.nextPatient = null;
    }

    public void addPatient(PatientDL newPatient) {
        if (this.nextPatient == null) {
            this.nextPatient = newPatient;
            newPatient.previousPatient = this;
        }
        else
            this.nextPatient.addPatient(newPatient);
    }

    public boolean deletePatient(PatientDL oldPatient) {
        if (this.nextPatient == null)
            return(false);
        else
        if (this.nextPatient.name.equals(oldPatient.name)){
            this.nextPatient = nextPatient.nextPatient;
            this.nextPatient.previousPatient = this;
            return(true);
        } else
            return(this.nextPatient.deletePatient(oldPatient));
    }

    public void printPatientListFW() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Illness: " + this.illness);
        if (this.nextPatient != null)
            this.nextPatient.printPatientList();
        else
            System.out.println("END OF LIST");
    }

    public void printPatientListBW() {
        System.out.println("Name: " + this.name + " Age: " + this.age + " Illness: " + this.illness);
        if (this.nextPatient != null)
            this.nextPatient.printPatientList();
        else
            System.out.println("END OF LIST");
    }

    public int patientListLengthIterative() {
        PatientDL tempPatient = this;
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