package Singleton;

public class Main {
  public static void main(String[] args) {
    // Lấy instance của PatientRecordManager (Singleton)
    PatientRecordManager manager = PatientRecordManager.getInstance();

    // Tạo bác sĩ và y tá
    Doctor doctor1 = new Doctor("Tran Van A");
    Nurse nurse1 = new Nurse("Nguyen Thi B");

    // Bác sĩ cập nhật hồ sơ bệnh nhân
    doctor1.updatePatientRecord("BN123", "Medical history: High blood pressure, currently taking medication A.");

    // Y tá truy vấn hồ sơ bệnh nhân
    nurse1.viewPatientRecord("BN123");

    // Kiểm tra Singleton: Bác sĩ khác cũng thấy cùng một dữ liệu
    Doctor doctor2 = new Doctor("Le Van C");
    doctor2.viewPatientRecord("BN123");

    // Xóa hồ sơ bệnh nhân
    manager.deletePatientRecord("BN123");

    // Thử truy vấn lại sau khi xóa
    nurse1.viewPatientRecord("BN123");
  }
}
