package activitytracker;

public abstract class SustainableAction {

    // Common attributes
    private int actionId;
    private String date;
    private String description;

    // Constructor
    public SustainableAction(int actionId, String date, String description) {
        this.actionId = actionId;
        this.date = date;
        this.description = description;
    }

    // Getters
    public int getActionId() {
        return actionId;
    }

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    // Setters
    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Abstract method
    public abstract int calculatePoints();

    // Display common details
    public String displayDetails() {
        return "Activity ID: " + actionId
                + "\nDate: " + date
                + "\nDescription: " + description;
    }
}