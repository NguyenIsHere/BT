package Singleton;

public class Main {
  public static void main(String[] args) {
    // Lấy thể hiện duy nhất của PatientRecordManager
    PatientRecordManager manager = PatientRecordManager.getInstance();

    // Tạo một số bệnh nhân
    Patient p1 = new Patient("BN123", "Nguyen Van A", 45, "High blood pressure");
    Patient p2 = new Patient("BN124", "Tran Thi B", 32, "Diabetes");

    // Thêm bệnh nhân vào hệ thống
    manager.addPatient(p1);
    manager.addPatient(p2);

    // Truy cập thông tin bệnh nhân
    System.out.println("\nBefore update:");
    System.out.println(manager.getPatient("BN123"));
    System.out.println(manager.getPatient("BN124"));

    // Cập nhật hồ sơ bệnh nhân
    manager.updateMedicalHistory("BN123", "High blood pressure, start taking medicine");
    manager.updateMedicalHistory("BN124", "Diabetes, need to control diet");

    // Hiển thị lại hồ sơ bệnh nhân sau khi cập nhật
    System.out.println("\nAfter update:");
    System.out.println(manager.getPatient("BN123"));
    System.out.println(manager.getPatient("BN124"));

    // Kiểm tra Singleton có hoạt động đúng không
    PatientRecordManager anotherInstance = PatientRecordManager.getInstance();
    System.out.println("\nCheck singleton: " + (manager == anotherInstance) + "\n");
  }
}
