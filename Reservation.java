public class Reservation{
public  String getReservationDetails(String hotelName, String guestName, int nights){
return "Hotel Name:"+hotelName+"\n"+"Guest Name:"+guestName+"\n"+"Nights:"+nights+"\n"+"--------";
}
public static void main(String[] args){
Reservation  reservation=new Reservation();
String reservation1=reservation.getReservationDetails("Grand Palace","David",3);
System.out.println(reservation1);
String reservation2=reservation.getReservationDetails("Grand Palace","Maria",2);
System.out.println(reservation2);
}
}
