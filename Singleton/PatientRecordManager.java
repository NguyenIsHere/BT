package Singleton;

import java.util.HashMap;
import java.util.Map;

public class PatientRecordManager {
  // Biến static để lưu thể hiện duy nhất của Singleton
  private static PatientRecordManager instance;

  // Dữ liệu lưu trữ hồ sơ bệnh nhân (giả lập bằng HashMap)
  private Map<String, String> patientRecords;

  // Hàm tạo private để ngăn chặn khởi tạo từ bên ngoài
  private PatientRecordManager() {
    patientRecords = new HashMap<>();
  }

  // Phương thức để lấy thể hiện duy nhất (Singleton)
  public static synchronized PatientRecordManager getInstance() {
    if (instance == null) {
      instance = new PatientRecordManager();
    }
    return instance;
  }

  // Thêm hoặc cập nhật hồ sơ bệnh nhân
  public void addOrUpdatePatient(String patientId, String record) {
    patientRecords.put(patientId, record);
    System.out.println("Patient profile [" + patientId + "] updated.");
  }

  // Truy vấn hồ sơ bệnh nhân
  public String getPatientRecord(String patientId) {
    return patientRecords.getOrDefault(patientId, "⚠ Patient profile not found!");
  }

  // Xóa hồ sơ bệnh nhân
  public void deletePatientRecord(String patientId) {
    if (patientRecords.containsKey(patientId)) {
      patientRecords.remove(patientId);
      System.out.println("Patient profile [" + patientId + "] deleted.");
    } else {
      System.out.println("⚠ Not found patient profile [" + patientId + "] to delete.");
    }
  }
}
