package activitytracker;

public class EnergySavingAction extends SustainableAction {

    private String activityType;
    private double hoursSaved;

    // Constructor
    public EnergySavingAction(int actionId, String date, String description,
                              String activityType, double hoursSaved) {

        super(actionId, date, description);

        this.activityType = activityType;
        this.hoursSaved = hoursSaved;
    }

    // Getters
    public String getActivityType() {
        return activityType;
    }

    public double getHoursSaved() {
        return hoursSaved;
    }

    // Setters
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setHoursSaved(double hoursSaved) {
        this.hoursSaved = hoursSaved;
    }

    // Overriding the parent's abstract method
    @Override
    public int calculatePoints() {
        return (int) (hoursSaved * 2);
    }

    // Display activity details
    @Override
    public String displayDetails() {

        return super.displayDetails()
                + "\nActivity Type: " + activityType
                + "\nHours Saved: " + hoursSaved
                + "\nPoints: " + calculatePoints();
    }
}