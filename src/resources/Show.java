package resources;
/**
 * Base Class for Show Entity
 */

import java.time.LocalDate;
import java.util.Date;

public class Show {
    private Long showId;
    private LocalDate showTime;
    private Date date;
    private Long screenId;
    private Long movieId;
    
    public Show() {
    }

    public Show(Long showId, LocalDate showTime, Date date, Long screenId, Long movieId) {
        this.showId = showId;
        this.showTime = showTime;
        this.date = date;
        this.screenId = screenId;
        this.movieId = movieId;
    }

    public Long getShowId() {
        return showId;
    }
    public void setShowId(Long showId) {
        this.showId = showId;
    }
    public LocalDate getShowTime() {
        return showTime;
    }
    public void setShowTime(LocalDate showTime) {
        this.showTime = showTime;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Long getScreenId() {
        return screenId;
    }
    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }
    public Long getMovieId() {
        return movieId;
    }
    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
