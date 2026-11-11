package activitytracker;

public class TransportAction extends SustainableAction {

    private String transportType;
    private double distanceKm;

    // Constructor
    public TransportAction(int actionId, String date, String description,
                           String transportType, double distanceKm) {

        super(actionId, date, description);

        this.transportType = transportType;
        this.distanceKm = distanceKm;
    }

    // Getters
    public String getTransportType() {
        return transportType;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    // Setters
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public void setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    // Overriding the parent's abstract method
    @Override
    public int calculatePoints() {

        if (transportType.equalsIgnoreCase("Walking")
                || transportType.equalsIgnoreCase("Cycling")) {

            return (int) (distanceKm * 2);
        } else {
            return (int) distanceKm;
        }
    }

    // Display activity details
    @Override
    public String displayDetails() {

        return super.displayDetails()
                + "\nTransport Type: " + transportType
                + "\nDistance: " + distanceKm + " km"
                + "\nPoints: " + calculatePoints();
    }
}