package com.adepuu.exercises.session7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

public class Event {
    private final String ID;
    private final HashSet<String> bookingList = new HashSet<>();
    private final HashMap<String, Ticket> availableTickets = new HashMap<>();
    private int ticketSold =0;
    private int tiketQouta =0;

    public Event(int maxTicket){
        UUID uuid = UUID.randomUUID();
        this.ID =uuid.toString();
        this.tiketQouta = maxTicket;
    }

    public HashMap<String, Ticket> getTicketList(){
        return availableTickets;
    }



    public boolean bookTicket(String userId){
        if (ticketSold >= tiketQouta){
            System.out.println("Ticket sold");
            return false;
        }

        if (!bookingList.add(userId)){
            System.out.println("Only allowed to book 1 ticket");
            return false;
        }
        return true;
    }

    public Ticket confirmTicket(String userId) {
        if (bookingList.contains(userId) && ticketSold <= tiketQouta){
            ticketSold++;
            Ticket ticket =new Ticket(this.ID);
            availableTickets.put(ticket.getID(), ticket);

            return ticket;
        }
        return null;
    }

}
