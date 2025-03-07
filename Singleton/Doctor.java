package Singleton;

public class Doctor {
  private String name;

  public Doctor(String name) {
    this.name = name;
  }

  public void viewPatientRecord(String patientId) {
    PatientRecordManager manager = PatientRecordManager.getInstance();
    System.out.println("Doctor " + name + " is viewing patient profile [" + patientId + "]: "
        + manager.getPatientRecord(patientId));
  }

  public void updatePatientRecord(String patientId, String record) {
    PatientRecordManager manager = PatientRecordManager.getInstance();
    System.out.println("Doctor " + name + " is updating patient profile [" + patientId + "]...");
    manager.addOrUpdatePatient(patientId, record);
  }
}
