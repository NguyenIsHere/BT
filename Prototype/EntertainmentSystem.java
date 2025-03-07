package Prototype;

public class EntertainmentSystem {
  public static void main(String[] args) {
    // Tạo đối tượng Movie ban đầu
    Movie originalMovie = new Movie("Inception", 148, "Sci-Fi");
    System.out.println("Original Movie: " + originalMovie);

    // Nhân bản đối tượng Movie
    EntertainmentProgram clonedMovie = originalMovie.clone();
    System.out.println("Cloned Movie: " + clonedMovie);

    // Tạo đối tượng TVShow ban đầu
    TVShow originalTVShow = new TVShow("Friends", 22, "Sitcom");
    System.out.println("Original TVShow: " + originalTVShow);

    // Nhân bản đối tượng TVShow
    EntertainmentProgram clonedTVShow = originalTVShow.clone();
    System.out.println("Cloned TVShow: " + clonedTVShow);

    // Tạo đối tượng MusicEvent ban đầu
    MusicEvent originalMusicEvent = new MusicEvent("Coachella", 180, "Festival");
    System.out.println("Original MusicEvent: " + originalMusicEvent);

    // Nhân bản đối tượng MusicEvent
    EntertainmentProgram clonedMusicEvent = originalMusicEvent.clone();
    System.out.println("Cloned MusicEvent: " + clonedMusicEvent);

    // Tùy chỉnh một bản sao
    clonedMovie.setName("Inception 2");
    clonedMovie.setDuration(160);
    System.out.println("Customized Cloned Movie: " + clonedMovie);
  }
}
