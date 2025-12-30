package astalakshmi.example;

public interface BookingProcessor {
    Booking processBooking(BookingRequest request);


    public class MemberBookingProcessor implements BookingProcessor {
        private int memberDiscount = 10;
        private int offPeakTimeDiscount = 5;

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

        public int getOffPeakTimeDiscount() {
            return offPeakTimeDiscount;
        }

        public void setOffPeakTimeDiscount(int offPeakTimeDiscount) {
            this.offPeakTimeDiscount = offPeakTimeDiscount;
        }
    }
    public class NonMemberBookingProcessor implements BookingProcessor {
        private int serviceFee = 50;
        @Override
        public Booking processBooking(BookingRequest request) {
            // Implement non-member-specific booking processing logic here
            return new Booking();
        }

        public int getServiceFee() {
            return serviceFee;
        }

        public void setServiceFee(int serviceFee) {
            this.serviceFee = serviceFee;
        }
    }
}