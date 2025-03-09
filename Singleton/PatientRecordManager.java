package Singleton;

import java.util.HashMap;
import java.util.Map;

public class PatientRecordManager {
  private static volatile PatientRecordManager instance; // Đảm bảo thread-safe
  private Map<String, Patient> records; // Lưu danh sách bệnh nhân

  private PatientRecordManager() {
    records = new HashMap<>();
  }

  public static PatientRecordManager getInstance() {
    if (instance == null) {
      synchronized (PatientRecordManager.class) { // Đảm bảo thread-safe
        if (instance == null) {
          instance = new PatientRecordManager();
        }
      }
    }
    return instance;
  }

  // Thêm bệnh nhân mới
  public void addPatient(Patient patient) {
    records.put(patient.getId(), patient);
  }

  // Cập nhật hồ sơ bệnh nhân
  public void updateMedicalHistory(String patientId, String newHistory) {
    Patient patient = records.get(patientId);
    if (patient != null) {
      patient.updateMedicalHistory(newHistory);
    } else {
      System.out.println("Cannot find patined with ID: " + patientId);
    }
  }

  // Truy vấn bệnh nhân
  public Patient getPatient(String patientId) {
    return records.get(patientId);
  }
}
