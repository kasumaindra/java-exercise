package com.adepuu.exercises.session7;

import java.util.UUID;

public class User {
    private final String ID;
    private final String name;
    private Ticket ticket;

    public User(String name){
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void saveTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public Ticket getTicket(){
        return ticket;
    }

    public String  getName(){
        return name;
    }


}
