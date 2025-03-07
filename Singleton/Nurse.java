package Singleton;

public class Nurse {
  private String name;

  public Nurse(String name) {
    this.name = name;
  }

  public void viewPatientRecord(String patientId) {
    PatientRecordManager manager = PatientRecordManager.getInstance();
    System.out.println(
        "Nurse " + name + " is viewing patient profile [" + patientId + "]: "
            + manager.getPatientRecord(patientId));
  }
}
