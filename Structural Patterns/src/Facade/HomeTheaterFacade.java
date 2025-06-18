package Facade;

public class  HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvd;
    private SoundSystem sound;

    public HomeTheaterFacade(TV tv, DVDPlayer dvd, SoundSystem sound) {
        this.tv = tv;
        this.dvd = dvd;
        this.sound = sound;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        tv.turnOn();
        sound.turnOn();
        dvd.playMovie(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie down...");
        dvd.stopMovie();
        sound.turnOff();
        tv.turnOff();
    }
}