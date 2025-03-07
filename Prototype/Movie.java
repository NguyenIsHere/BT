package Prototype;

public class Movie implements EntertainmentProgram {
  private String name;
  private int duration;
  private String type;

  public Movie(String name, int duration, String type) {
    this.name = name;
    this.duration = duration;
    this.type = type;
  }

  @Override
  public EntertainmentProgram clone() {
    return new Movie(this.name, this.duration, this.type);
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
    return "Movie [name=" + name + ", duration=" + duration + ", type=" + type + "]";
  }
}
