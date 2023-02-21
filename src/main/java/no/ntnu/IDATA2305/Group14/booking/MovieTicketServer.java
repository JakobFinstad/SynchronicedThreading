package no.ntnu.IDATA2305.Group14.booking;

/**
 * A class that represents a server where
 */
public class MovieTicketServer {
    private String movieName;
    private int availableSeats;

    /**
     * Constructor for the class.
     *
     * @param movieName name of the movie
     * @param availableSeats available seats in the movie theatre
     */
    public MovieTicketServer(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    /**
     * Prints out the amount of tickets available.
     * If there not enough tickets, one will not be able to order.
     * If there is enough one will get to order, and the amount is updated.
     * @param customerName name of the customer
     * @param numberOfSeats number of seats available in the theatre
     */
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
