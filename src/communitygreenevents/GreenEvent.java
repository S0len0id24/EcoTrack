/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communitygreenevents;

/**
 *
 * @author bunty
 */
public abstract class GreenEvent {
    
    // Declaring our Data Members
    private int eventId;
    private String eventName;
    private String date;
    private String location;
    private int maxParticipants;
    
    // Constructor
    public  GreenEvent(int eventId, String eventName, String date, String location, int maxParticipants){
        this.eventId = eventId;
        this.eventName = eventName;
        this.date = date;
        this.location = location;
        this.maxParticipants = maxParticipants;
    }
    
    // Getters
    public int getEventId(){
        return eventId;
    }
    
    public String getEventName(){
        return eventName;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getLocation(){
        return location;
    }
    
    public int getMaxParticipants(){
        return maxParticipants;
    }
    
    // Setters
    public void setEventId(int eventId){
        this.eventId = eventId;
    }
    
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public void setLocation(String location){
        this.location = location;
    }
    
    public void setMaxParticipants(int maxParticipants){
        this.maxParticipants = maxParticipants;
    }
    
    // Abstract Method
    public abstract String getEventType();
    
    public String displayDetails(){
        return "Event ID: " + eventId + "\nEvent Name: " + eventName + "\nDate: " + date + "\nLocation: " + location + "\nMax Participants: " + maxParticipants + "\nEvent Type: " + getEventType();
    }
    
}
