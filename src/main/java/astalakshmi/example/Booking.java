package astalakshmi.example;

import org.w3c.dom.ls.LSOutput;

public class Booking {
    private String referenceNumber;
    private  double totalPrice;
    private boolean prioritizedService;
    public Booking(){
    BookingRequest request = new BookingRequest("John Doe", "10:00 AM", true, 0);
    this.referenceNumber = "REF123456";
    this.totalPrice = 250.0;
    this.prioritizedService = true;
    }
    BookingProcessor processor= new BookingProcessor.MemberBookingProcessor();
    public String getReferenceNumber() {
        return referenceNumber;


    }
    BookingProcessor processorNon= new BookingProcessor.NonMemberBookingProcessor();
    public double getTotalPrice() {
        return totalPrice;

    }
    BookingProcessor b = new BookingProcessor() {
        @Override
        public Booking processBooking(BookingRequest request) {
            return null;
        }
    };
    public boolean isPrioritizedService() {
        return prioritizedService;
    }
}
