package astalakshmi.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Booking System Initialized");
        BookingRequest request = new BookingRequest("Alice", "2:00 PM", true, 0);
       // Switch between Member and Non-Member Booking Processor
        BookingProcessor processor= new BookingProcessor.MemberBookingProcessor();
        // new non-member processor
        // BookingProcessor processor= new BookingProcessor.NonMemberBookingProcessor();
        Booking booking = processor.processBooking(request);
        System.out.println("Booking Reference: " + booking.getReferenceNumber());

    }

}
