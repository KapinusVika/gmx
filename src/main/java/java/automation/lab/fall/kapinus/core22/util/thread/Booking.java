package java.automation.lab.fall.kapinus.core22.util.thread;


import java.automation.lab.fall.kapinus.core22.domain.UserBook;

public class Booking {

    public synchronized void book(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Booking booking = new Booking();
        UserBook.BookingThread cl = new UserBook.BookingThread(booking, "Client 1 finished booking");
        UserBook.BookingThread c2 = new UserBook.BookingThread(booking, "Client 2 finished booking");

        try {
            cl.b.join();
            c2.b.join();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
}




