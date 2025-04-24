package login_app.models;

public class Game {
    private String name;
    private String genre;
    private String publisher;

    public Game(String name, String genre, String publisher) {
        this.name = name;
        this.genre = genre;
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
