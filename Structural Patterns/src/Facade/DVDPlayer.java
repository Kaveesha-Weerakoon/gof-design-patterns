package Facade;

public class DVDPlayer {
    public void playMovie(String movie) {
        System.out.println("Playing movie: " + movie);
    }

    public void stopMovie() {
        System.out.println("Movie stopped");
    }
}
