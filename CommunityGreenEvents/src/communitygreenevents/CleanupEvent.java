/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communitygreenevents;

/**
 *
 * @author bunty
 */

public class CleanupEvent extends GreenEvent {
    
    // Declaring Data Member, 
    private String areaType;
    
    // Override Method
    @Override
    public String getEventType(){
        return "Cleanup";    
    }
    
    // Constructor
    public CleanupEvent(int eventId, String eventName, String date, String location, int maxParticipants, String areaType){
        super(eventId, eventName, date, location, maxParticipants);
        this.areaType = areaType;
    }
    
    // Getter
    public String getAreaType(){
        return areaType;
    }
    
    // Setter
    public void setAreaType(String areaType){
        this.areaType = areaType;
    }
    
}

