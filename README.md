# SynchronicedThreading

## Observations
In our program we observed, that the 4 threads
work at different speeds. The second thread finished
the order and got a notice before the first thread
was done. So does the 4th thread, this
caused the 3rd thread to not be able to order any
tickets since there were no empty seats.

Everyone that tried to order tickets, got the
message "... 10 : Seats available...", even tho
there would not be 10 seats available when it
would be their turn to order.