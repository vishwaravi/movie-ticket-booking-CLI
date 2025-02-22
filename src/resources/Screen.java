package resources;
/**
 * Base Class for Screen entity
 */
public class Screen {
    private Long screenId;
    private int screenNo;
    private int totalSeats;
    private int theaterId;
    private int seatCount;
    private String[] bookedSeats;

    
    public Screen() {
    }
    
    public Screen(Long screenId, int screenNo, int totalSeats, int theaterId, int seatCount, String[] bookedSeats) {
        this.screenId = screenId;
        this.screenNo = screenNo;
        this.totalSeats = totalSeats;
        this.theaterId = theaterId;
        this.seatCount = seatCount;
        this.bookedSeats = bookedSeats;
    }

    public int getSeatCount() {
        return seatCount;
    }
    
    public void setBookedSeats(String[] bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String[] getBookedSeats() {
        return bookedSeats;
    }
    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
    public Long getScreenId() {
        return screenId;
    }
    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }
    public int getScreenNo() {
        return screenNo;
    }
    public void setScreenNo(int screenNo) {
        this.screenNo = screenNo;
    }
    public int getTotalSeats() {
        return totalSeats;
    }
    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
    public int getTheaterId() {
        return theaterId;
    }
    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }
    
}
