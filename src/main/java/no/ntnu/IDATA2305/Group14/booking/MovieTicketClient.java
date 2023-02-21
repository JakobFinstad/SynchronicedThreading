package no.ntnu.IDATA2305.Group14.booking;

/**
 * A class for ordering tickets, represent a person ordering a ticket.
 */
public class MovieTicketClient extends Thread {

    private String customer;
    private int numberOfTickets;
    private MovieTicketServer ticketServer;

    /**
     * Constructor for the class.
     *
     * @param customer name of the reservation
     * @param numberOfTickets that shall be ordered
     * @param movieTicketServer the server that we shall order from
     */
    public MovieTicketClient(String customer, int numberOfTickets, MovieTicketServer movieTicketServer) {
        setCustomer(customer);
        setNumberOfTickets(numberOfTickets);
        this.ticketServer = movieTicketServer;
    }


    /**
     * Books tickets from the server, with the required information.
     */
    public void run(){
        System.out.println("Ordering tickets...");
        ticketServer.bookTicket(customer,numberOfTickets);
    }

    /**
     * Set the customer name. Cannot be null or empty.
     *
     * @param customer name of the customer, cannot be null or empty
     */
    private void setCustomer(String customer) {
        if (customer.isEmpty() || customer == null) {
            throw new IllegalArgumentException("Customer cannot be empty!");
        }
        this.customer = customer;
    }

    /**
     * Set the number of tickets that shall be ordered. Cannot be 0 or lower.
     *
     * @param numberOfTickets that shall be ordered
     */
    private void setNumberOfTickets(int numberOfTickets) {
        if (numberOfTickets <= 0) {
            throw new IllegalArgumentException("Number of tickets must be above 0!");
        }
        this.numberOfTickets = numberOfTickets;
    }
}
