package Singleton;

public class Patient {
  private String id;
  private String name;
  private int age;
  private String medicalHistory; // Tiểu sử bệnh án

  public Patient(String id, String name, int age, String medicalHistory) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.medicalHistory = medicalHistory;
  }

  public String getId() {
    return id;
  }

  public void updateMedicalHistory(String newHistory) {
    this.medicalHistory = newHistory;
  }

  @Override
  public String toString() {
    return "Patiend: " + name + " (ID: " + id + "), Age: " + age + ", Medical History: " + medicalHistory;
  }
}
