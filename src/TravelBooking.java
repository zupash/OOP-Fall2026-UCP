class TravelBooking{
     static String Airlinename="PIA";
    private int bookingref;
    private  String source;
    private String destination;
    private String seatno;
    private boolean status;
    /*void setdata(){ //mutator/setter
        bookingref=1245;
        source="LHR";
        destination="ISL";
        seatno="18A";
        status=true;
    }*/

    void setdata(int br,String s,String d,String seat,boolean st){ //mutator/setter
        bookingref=br;
        source=s;
        destination=d;
        seatno=seat;
        status=st;
    }
    void changeSeat(String sn){
        seatno=sn;
    }
    void viewBooking() //accessor/getter
    {
        System.out.println(bookingref+" "+source+" "+
                destination+ " "+ seatno+ " "+
                status);
    }
}
class Main { //utility
    public static void main(String[] args) {
        TravelBooking booking1=new TravelBooking();
        System.out.println(TravelBooking.Airlinename);
        booking1.viewBooking();
        //booking1.setdata();
        booking1.setdata(1234,"LHR","ISL","18A",true);
        //booking1.bookingref=1234;
        //booking1.seatno="18A";
        booking1.viewBooking();
        //System.out.println(booking1.bookingref+" "+booking1.source+" "+
        //     booking1.destination+ " "+ booking1.seatno+ " "+
        //   booking1.status);
        booking1.changeSeat("20A");
        booking1.viewBooking();
        TravelBooking booking2=new TravelBooking();
        booking1.viewBooking();
        booking2.setdata(1234,"LHR","ISL","18B",true);
        booking2.viewBooking();
        TravelBooking booking3=new TravelBooking();
        booking3.viewBooking();
        booking3.setdata(1234,"LHR","ISL","19A",true);
        booking3.viewBooking();
    }
}