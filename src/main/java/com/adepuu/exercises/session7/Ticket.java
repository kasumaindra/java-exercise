package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.UUID;

public class Ticket {

    private final String ID;
    private String eventID;



    public Ticket(String eventID){
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.eventID = eventID;

    }

    public String getID() {
        return ID;
    }
    public String getEventID(){
        return eventID;
    }






}
