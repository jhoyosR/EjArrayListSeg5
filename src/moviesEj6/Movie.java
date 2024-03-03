package moviesEj6;

public class Movie {
    private String title;
    private String star;
    private String director;
    private float price;

    public Movie(String title, String star, String director, float price) {
        this.title = title;
        this.star = star;
        this.director = director;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", star='" + star + '\'' +
                ", director='" + director + '\'' +
                ", price=" + price +
                '}';
    }
}
