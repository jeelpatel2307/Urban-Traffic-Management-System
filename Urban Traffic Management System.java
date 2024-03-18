import java.util.HashMap;
import java.util.Map;

// Represents a Traffic Light at an Intersection
class TrafficLight {
    private String id;
    private String color;

    public TrafficLight(String id) {
        this.id = id;
        this.color = "Red"; // Initially set to Red
    }

    public String getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    // Change the color of the traffic light
    public void changeColor(String newColor) {
        color = newColor;
        System.out.println("Traffic light " + id + " changed to " + color);
    }
}

// Represents an Intersection with Traffic Lights
class Intersection {
    private Map<String, TrafficLight> trafficLights;

    public Intersection() {
        trafficLights = new HashMap<>();
    }

    // Add a new traffic light to the intersection
    public void addTrafficLight(String id) {
        trafficLights.put(id, new TrafficLight(id));
    }

    // Change the color of a specific traffic light
    public void changeTrafficLightColor(String id, String newColor) {
        TrafficLight trafficLight = trafficLights.get(id);
        if (trafficLight != null) {
            trafficLight.changeColor(newColor);
        } else {
            System.out.println("Traffic light " + id + " does not exist.");
        }
    }
}

// Main class to demonstrate the Urban Traffic Management System
public class UrbanTrafficManagementSystem {
    public static void main(String[] args) {
        Intersection intersection = new Intersection();

        // Add traffic lights to the intersection
        intersection.addTrafficLight("TL1");
        intersection.addTrafficLight("TL2");

        // Simulate traffic light changes
        intersection.changeTrafficLightColor("TL1", "Green");
        intersection.changeTrafficLightColor("TL2", "Red");
        intersection.changeTrafficLightColor("TL3", "Green"); // Non-existing traffic light
    }
}
