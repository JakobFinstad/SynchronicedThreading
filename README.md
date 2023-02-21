# SynchronizedThreading

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

## Fixes
Changed the run method to synchronized, and
added a synchronized code block locked on the
ticket server. In the main method we joined the
different threads in order to let them cooperate.
This fixed the issue by forcing the threads
to be locked on the object ticketServer. Therefor
they would not continue until the thread that had started
finished.

## Installation
To install this program, simply download the program,
then you would need to compile the classes.
We used intellij's compiler to compile
the whole project, but this can also be done in
the terminal with mvn compile.
After the compilation run the main class's
public static void main.