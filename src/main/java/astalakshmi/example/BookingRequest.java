package astalakshmi.example;

public class BookingRequest {
    private final String customerName;
    private final String timeslot;
    private final boolean member;

    public BookingRequest(String customerName, String timeslot, boolean member, double basePrice) {
        this.customerName = customerName;
        this.timeslot = timeslot;
        this.member = member;
    }

    public String getCustomerName() {
        return customerName;
    }
    public String getTimeslot() {
        return timeslot;
    }
    public boolean isMember() {
        return member;

    }



}
