# SynchronicedThreading

## Observations
In our program we observed, that the 4 threads
work at different speeds. The second thread finished
the order and got a notice before the first thread
was done. So does the 4th thread, this
caused the 3rd thread to not be able to order any
tickets since there were no empty seats.