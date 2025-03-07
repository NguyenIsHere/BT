package Prototype;

public class MusicEvent implements EntertainmentProgram {
  private String name;
  private int duration;
  private String type;

  public MusicEvent(String name, int duration, String type) {
    this.name = name;
    this.duration = duration;
    this.type = type;
  }

  @Override
  public EntertainmentProgram clone() {
    return new MusicEvent(this.name, this.duration, this.type);
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setDuration(int duration) {
    this.duration = duration;
  }

  @Override
  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public int getDuration() {
    return duration;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public String toString() {
    return "MusicEvent [name=" + name + ", duration=" + duration + ", type=" + type + "]";
  }
}
