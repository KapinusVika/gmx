package com.java.automation.lab.fall.kapinus.core22.util.thread;

import com.java.automation.lab.fall.kapinus.core22.domain.Trainer;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "UserBook")
@XmlType(propOrder = { "day", "hour"})
public class UserBook implements Serializable {
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


        public BookingThread(String msg, Booking booking, Thread b) {
            this.msg = msg;
            this.booking = booking;
            this.b = b;
        }

        @Override
        public void run() {
            booking.book(msg);
        }
    }
}
