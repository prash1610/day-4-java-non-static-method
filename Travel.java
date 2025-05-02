public class Travel{
public String  getBookingDetails(String agency, String destination, int travellers){
return "Agency :"+agency +"\n"+"Destination:"+destination+"\n"+"Travellers:"+travellers+"\n"+"----------------------------";
}
public static void main (String[] args)
{
Travel booking=new Travel();
String booking1=booking.getBookingDetails("Wanderlust","Paris",2);
System.out.println(booking1);
String booking2=booking.getBookingDetails("Wanderlust","Tokyo",3);
System.out.println(booking2);
}
}
