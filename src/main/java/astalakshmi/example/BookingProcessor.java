package astalakshmi.example;

public interface BookingProcessor {
    Booking processBooking(BookingRequest request);


    public class MemberBookingProcessor implements BookingProcessor {
        private int memberDiscount = 10;

        @Override
        public Booking processBooking(BookingRequest request) {
            // Implement member-specific booking processing logic here
            return new Booking();
        }

        public int getMemberDiscount() {
            return memberDiscount;
        }

        public void setMemberDiscount(int memberDiscount) {
            this.memberDiscount = memberDiscount;
        }
    }
    public class NonMemberBookingProcessor implements BookingProcessor {
        @Override
        public Booking processBooking(BookingRequest request) {
            // Implement non-member-specific booking processing logic here
            return new Booking();
        }

    }
}