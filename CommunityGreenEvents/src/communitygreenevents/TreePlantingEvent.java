/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communitygreenevents;

/**
 *
 * @author bunty
 */
public class TreePlantingEvent extends GreenEvent {
    
    // Declare Data Members
    private int plannedTrees;
    
    // Override Method
    @Override
    public String getEventType(){
        return "Tree Planting";
    }
    
    // Constructor
    public TreePlantingEvent(int eventId, String eventName, String date, String location, int maxParticipants, int plannedTrees){
        super(eventId, eventName, date, location, maxParticipants);
        this.plannedTrees = plannedTrees;
    }
    
    // Getter
    public int getPlannedTrees(){
        return plannedTrees;
    }
    
    // Setter
    public void setPlannedTrees(int plannedTrees){
        this.plannedTrees = plannedTrees;
    }
    
}
