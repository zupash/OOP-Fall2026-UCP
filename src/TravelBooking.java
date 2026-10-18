
public class TravelBooking {
    static String Airlinename="PIA";
    private int bookingReference;
    String source;
    String destination;
    private String travelDate;
    private String seatNumber;
    private boolean status;

    public TravelBooking() {
        bookingReference = 0;
        source = "Not Assigned";
        destination = "Not Assigned";
        travelDate = "Not Assigned";
        seatNumber = "Not Assigned";
        status = true;
    }

    public TravelBooking(int ref, String source, String destination, String date, String seat) {
        bookingReference = ref;
        this.source = source;
        this.destination=destination;
        travelDate = date;
        seatNumber = seat;
        status = true;
    }

    public void setBookingReference(int ref) {   bookingReference = ref; }
    public void setSource(String source) { this.source = source;    }
    public void setDestination(String destination) { this.destination = destination;    }
    public void setTravelDate(String date) {    travelDate = date;       }
    public void setSeatNumber(String seat) {        changeSeat(seat);    }

    public int getBookingReference() {  return bookingReference;    }
    public String getSource() {    return this.source;    }
    public String getDestination(){    return  destination; }
    public String getTravelDate() {  return travelDate;    }
    public String getSeatNumber() {   return seatNumber;    }
    public boolean getStatus() {    return status;    }


    public void changeSeat(String newSeat) {
        if (!status) {
            System.out.println("Seat cannot be changed after check-in.");
        } else if (newSeat == null) {
            System.out.println("Invalid seat number.");
        } else {
            seatNumber = newSeat;
            System.out.println("Seat changed to " + newSeat);
        }
    }

    public void checkIn() {
        if (status) {
            status = true;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Already checked in.");
        }
    }

    void displayBooking() {
        System.out.println("Booking Reference: " + bookingReference);
        System.out.println("Source: " + source);
        System.out.println("Destination: "+ destination);
        System.out.println("Travel Date: " + travelDate);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Status: " + status);
    }
}
