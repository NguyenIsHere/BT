package Prototype;

import java.util.HashMap;
import java.util.Map;

public class ProgramRegistry {
  private Map<String, EntertainmentProgram> registry = new HashMap<>();

  // Đăng ký chương trình vào registry
  public void addProgram(String key, EntertainmentProgram program) {
    registry.put(key, program);
  }

  // Nhân bản chương trình dựa trên key
  public EntertainmentProgram cloneProgram(String key) {
    EntertainmentProgram program = registry.get(key);
    return (program != null) ? program.clone() : null;
  }
}
