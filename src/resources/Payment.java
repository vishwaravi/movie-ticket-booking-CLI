package resources;
/**
 * Base Class for payment Entity
 */

import java.time.LocalDateTime;

public class Payment {
    private long paymentId;
    private long bookingId;
    private LocalDateTime paymentDate;
    private String paymentMethod;
    private String paymentStatus;
    
    public Payment() {
    }
    public Payment(long paymentId, long bookingId, LocalDateTime paymentDate, String paymentMethod,
            String paymentStatus) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
    public long getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(long paymentId) {
        this.paymentId = paymentId;
    }
    public long getBookingId() {
        return bookingId;
    }
    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
