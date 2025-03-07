package Prototype;

public interface EntertainmentProgram {
  EntertainmentProgram clone(); // Phương thức để nhân bản đối tượng

  void setName(String name); // Thiết lập tên chương trình

  void setDuration(int duration); // Thiết lập thời lượng (phút)

  void setType(String type); // Thiết lập loại hình giải trí

  String getName(); // Lấy tên chương trình

  int getDuration(); // Lấy thời lượng

  String getType(); // Lấy loại hình giải trí
}
