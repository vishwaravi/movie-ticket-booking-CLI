package resources;
/**
 * Base Class for Booking Information Entity
 */

import java.time.LocalDateTime;

public class Booking {
    private Long bookingId;
    private LocalDateTime bookingDate;
    private int bookedSeatCounts;
    private long userId;
    private long showId;
    private int totalAmount;

    public Booking() {
    }
    public Booking(Long bookingId, LocalDateTime bookingDate, int bookedSeatCounts, long userId, long showId,
            int totalAmount) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookedSeatCounts = bookedSeatCounts;
        this.userId = userId;
        this.showId = showId;
        this.totalAmount = totalAmount;
    }
    public Long getBookingId() {
        return bookingId;
    }
    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }
    public LocalDateTime getBookingDate() {
        return bookingDate;
    }
    public void setBookingDate(LocalDateTime bookingDate) {
        this.bookingDate = bookingDate;
    }
    public int getBookedSeatCounts() {
        return bookedSeatCounts;
    }
    public void setBookedSeatCounts(int bookedSeatCounts) {
        this.bookedSeatCounts = bookedSeatCounts;
    }
    public long getUserId() {
        return userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public long getShowId() {
        return showId;
    }
    public void setShowId(long showId) {
        this.showId = showId;
    }
    public int getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
}
