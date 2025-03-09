package Prototype;

public abstract class AbstractEntertainmentProgram implements EntertainmentProgram {
  protected String name;
  protected int duration; // Thời lượng (phút)
  protected String type; // Loại chương trình

  public AbstractEntertainmentProgram(String name, int duration, String type) {
    this.name = name;
    this.duration = duration;
    this.type = type;
  }

  @Override
  public EntertainmentProgram clone() {
    try {
      return (EntertainmentProgram) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException("Error cloning object", e);
    }
  }

  @Override
  public void displayInfo() {
    System.out
        .println("Name: " + name + ", Duration: " + duration + " minutes, Type: " + type);
  }
}
