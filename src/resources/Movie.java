package resources;

/**
 * Base class for Movie Entity
 */
public class Movie {
    private Long movieId;
    private String title;
    private String language;
    private String duartion;
    private String year;
    private String rating;

    public Long getMovieId() {
        return movieId;
    }
    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getDuartion() {
        return duartion;
    }
    public void setDuartion(String duartion) {
        this.duartion = duartion;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
}
