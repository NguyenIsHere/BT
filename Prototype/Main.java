package Prototype;

public class Main {
  public static void main(String[] args) {
    // Tạo các chương trình ban đầu
    Movie movie = new Movie("Inception", 148, "Action, Adventure, Sci-Fi");
    TVShow tvShow = new TVShow("Breaking Bad", 60, "Crime, Drama, Thriller");
    MusicEvent musicEvent = new MusicEvent("Coachella 2025", 180, "Music Festival");

    // Nhân bản các chương trình
    EntertainmentProgram clonedMovie = movie.clone();
    EntertainmentProgram clonedTVShow = tvShow.clone();
    EntertainmentProgram clonedMusicEvent = musicEvent.clone();

    // Hiển thị thông tin
    System.out.println("\nOriginal programs:");
    movie.displayInfo();
    tvShow.displayInfo();
    musicEvent.displayInfo();

    System.out.println("\nCloned programs:");
    clonedMovie.displayInfo();
    clonedTVShow.displayInfo();
    clonedMusicEvent.displayInfo();
  }
}
