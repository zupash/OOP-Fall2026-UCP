public class Main {
    public static void main(String[] args) {
        System.out.println(TravelBooking.Airlinename);

        TravelBooking booking = new TravelBooking();
        booking.setBookingReference(123);
        booking.setSource("LHR");
        booking.setDestination("ISL");
        booking.setTravelDate("10-Dec-2026");
        booking.setSeatNumber("18A");

        System.out.println("Initial Booking:");
        booking.displayBooking();

        booking.changeSeat("20B");
        booking.checkIn();
        booking.changeSeat("22C");

        System.out.println("Final Booking:");
        booking.displayBooking();

        System.out.println("Second Object/Booking");
        TravelBooking booking2=new TravelBooking(111,"LHR","MUL", "10-Dec-2026", "11A");
        booking2.displayBooking();
    }
}
