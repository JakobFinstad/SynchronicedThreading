package no.ntnu.IDATA2305.Group14;

import no.ntnu.IDATA2305.Group14.booking.MovieTicketServer;
import no.ntnu.IDATA2305.Group14.booking.MovieTicketClient;

public class Main {
    public static void main(String[] args) {
        MovieTicketServer movieTicketServer = new MovieTicketServer("Troll", 10);

        // Creating 4 threads
        Thread t1 = new MovieTicketClient("Xiangming", 3, movieTicketServer);
        Thread t2 = new MovieTicketClient("Ilaria", 2, movieTicketServer);
        Thread t3 = new MovieTicketClient("Sam", 3, movieTicketServer);
        Thread t4 = new MovieTicketClient("Andreas", 4, movieTicketServer);

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}