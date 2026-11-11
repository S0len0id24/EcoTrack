/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communitygreenevents;

/**
 *
 * @author bunty
 */
// Importing an ArrayList Method
import java.util.ArrayList;

public class EventManager {
    
    // Declaring Data Members
    private ArrayList<GreenEvent> events;
    
    // Constructor
    public EventManager(){
        this.events = new ArrayList<>();
    }
    
    // Add Event Method
    public void addEvent(GreenEvent event){
        events.add(event);
    }
    
    // Display All Events Method
    public void displayEvents(){
        for (GreenEvent event: events){
            System.out.println(event.displayDetails());
        }
    }
   
    // Search Event by ID Method
    public GreenEvent searchEvent(int eventId){
        for (GreenEvent event: events){
            if (event.getEventId()== eventId){
                return event;
            } 
        }
        
        return null;
    }
    
    // Deleting and Event by ID Method
    public boolean deleteEvent(int eventId){
        GreenEvent event = searchEvent(eventId);
        
        if(event != null){
            return events.remove(event);
        }
        
        return false;
    }
}
