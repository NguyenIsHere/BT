package Prototype;

public class Main {
  public static void main(String[] args) {
    // Tạo registry
    ProgramRegistry programRegistry = new ProgramRegistry();

    // Đăng ký các chương trình gốc
    programRegistry.addProgram("movie", new Movie("Inception", 148, "Action, Adventure, Sci-Fi"));
    programRegistry.addProgram("tvShow", new TVShow("Breaking Bad", 60, "Crime, Drama, Thriller"));
    programRegistry.addProgram("musicEvent", new MusicEvent("Coachella 2025", 180, "Music Festival"));

    // Nhân bản các chương trình từ registry
    EntertainmentProgram clonedMovie = programRegistry.cloneProgram("movie");
    EntertainmentProgram clonedTVShow = programRegistry.cloneProgram("tvShow");
    EntertainmentProgram clonedMusicEvent = programRegistry.cloneProgram("musicEvent");

    // Hiển thị thông tin
    System.out.println("\nOriginal programs:");
    programRegistry.cloneProgram("movie").displayInfo();
    programRegistry.cloneProgram("tvShow").displayInfo();
    programRegistry.cloneProgram("musicEvent").displayInfo();

    System.out.println("\nCloned programs:");
    clonedMovie.displayInfo();
    clonedTVShow.displayInfo();
    clonedMusicEvent.displayInfo();
  }
}
