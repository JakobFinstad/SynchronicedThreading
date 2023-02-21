package no.ntnu.IDATA2305.Group14.booking;

public class MovieTicketServer {
    private String movieName;
    private int availableSeats;

    public MovieTicketServer(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }


    public void bookTicket(String customerName, int numberOfSeats) {
        System.out.println("Hi, " + customerName + ". " + availableSeats + " Seats available for " + movieName);

        // TBD
        if ((availableSeats - numberOfSeats) < 0) {
            System.out.println("Hi, " + customerName + ". " + "There are currently " + availableSeats + " seat(s) available"
                    + ", which means you cannot book " + numberOfSeats + " seats.");
        } else {
            this.availableSeats = availableSeats - numberOfSeats;
            System.out.println("Hi," + customerName + " : " + numberOfSeats + " Seats booked successfully for " + movieName);
        }
    }
}
