package java.automation.lab.fall.kapinus.core22.util.thread;

import java.automation.lab.fall.kapinus.core22.domain.Client;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

class ClientsBooking extends Thread {
    Semaphore counter;
    Object client;

        ClientsBooking(Semaphore counter, Object client){
            this.client = client;
            this.counter = counter;
        }

        public void run(){
            try {
                counter.acquire();
                System.out.println ("Client " + client + " creates a booking");
                sleep(1000);

                System.out.println ("Client " + client + " finished booking");
                counter.release();

                sleep(1000);

            } catch(InterruptedException e) {
                System.out.println ("Client " + client + " have a problem with booking");
            }
        }

    public static void main(String [] args){
        List<Client> clients = new ArrayList<>();
//        clients.add("F");        Это я проверяла работу программы
//        clients.add("A");         Запускает по одному клиенту для записи
//        clients.add("D");
//        clients.add("E");
//        clients.add("G");

        Semaphore counter = new Semaphore(1, true);
        for(int i=0; i < clients.size(); i++){
            new ClientsBooking(counter, clients.get(i)).start();
        }
    }
}

