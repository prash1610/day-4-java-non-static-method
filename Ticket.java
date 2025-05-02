public class Ticket{
    public String getTicketInfo(String theaterName, String movieName, String seatNo) {
        return "Theater Name : " + theaterName + "\n"
             + "Movie Name : " + movieName + "\n"
             + "Seat No : " + seatNo + "\n"
             + "------------------------------";
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        
        String info1 = ticket.getTicketInfo("Galaxy Cinemas", "Interstellar", "A10");
        String info2 = ticket.getTicketInfo("Galaxy Cinemas", "Inception", "B12");
        
        System.out.println(info1);
        System.out.println(info2);
    }
}