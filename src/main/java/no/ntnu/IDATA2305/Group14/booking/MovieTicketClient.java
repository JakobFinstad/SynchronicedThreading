package no.ntnu.IDATA2305.Group14.booking;

public class MovieTicketClient extends Thread {

    private String customer;
    private int numberOfTickets;
    public MovieTicketClient(String customer, int NumberOfTickets) {
        setCustomer(customer);
        setNumberOfTickets(numberOfTickets);
    }

    public void run(){

    }

    private void setCustomer(String customer) {
        if (customer.isEmpty() || customer == null) {
            throw new IllegalArgumentException("Customer cannot be empty!");
        }
        this.customer = customer;
    }

    private void setNumberOfTickets(int numberOfTickets) {
        if (numberOfTickets <= 0) {
            throw new IllegalArgumentException("Number of tickets must be above 0!");
        }
        this.numberOfTickets = numberOfTickets;
    }
}
