package java.automation.lab.fall.kapinus.core22.domain;

import java.automation.lab.fall.kapinus.core22.util.thread.Booking;

public class UserBook {
    int day;
    int hour;

    public UserBook(int day, int hour){
        this.day = day;
        this.hour = hour;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public boolean bookingTraining(Reception reception, Trainer trainer, UserBook userBook){
        return (reception.booking(trainer, userBook));
    }

    public static class BookingThread implements Runnable {
        String msg;
        Booking booking;
        public Thread b;


        public BookingThread(Booking booking, String msg) {
            this.msg = msg;
            this.booking = booking;
            this.b = new Thread();
            this.b.start();

        }

        public BookingThread(Booking booking, String msg) {
        }

        @Override
        public void run() {
            booking.book(msg);
        }
    }
}
