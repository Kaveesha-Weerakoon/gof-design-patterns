package Facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        DVDPlayer dvd = new DVDPlayer();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, dvd, sound);

        homeTheater.watchMovie("The Matrix");
        System.out.println();
        homeTheater.endMovie();
    }
}
