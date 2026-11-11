package activitytracker;

import java.util.ArrayList;

public class ActivityManager {

    // ArrayList to store sustainable activities
    private ArrayList<SustainableAction> actions;

    // Constructor
    public ActivityManager() {
        actions = new ArrayList<SustainableAction>();
    }

    // Add an activity
    public void addAction(SustainableAction action) {
        actions.add(action);
        System.out.println("Activity added successfully!");
    }

    // Display all activities
    public void displayActions() {

        if (actions.isEmpty()) {
            System.out.println("No activities found.");
        } else {

            for (int i = 0; i < actions.size(); i++) {
                System.out.println("----------------------");
                System.out.println(actions.get(i).displayDetails());
            }
        }
    }

    // Search for an activity using its ID
    public SustainableAction searchAction(int actionId) {

        for (int i = 0; i < actions.size(); i++) {

            if (actions.get(i).getActionId() == actionId) {
                return actions.get(i);
            }
        }

        return null;
    }

    // Delete an activity using its ID
    public boolean deleteAction(int actionId) {

        for (int i = 0; i < actions.size(); i++) {

            if (actions.get(i).getActionId() == actionId) {
                actions.remove(i);
                return true;
            }
        }

        return false;
    }

    // Calculate total sustainability points
    public int calculateTotalPoints() {

        int totalPoints = 0;

        for (int i = 0; i < actions.size(); i++) {

            totalPoints = totalPoints
                    + actions.get(i).calculatePoints();
        }

        return totalPoints;
    }
}