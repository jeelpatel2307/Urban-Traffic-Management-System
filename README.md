# Urban Traffic Management System

The Urban Traffic Management System is a Java-based project designed to simulate traffic lights at intersections and manage traffic flow in an urban environment.

## Description

This project consists of classes representing traffic lights and intersections. Each traffic light can be in one of three states: Red, Yellow, or Green. The Intersection class manages multiple traffic lights and allows for changing the color of individual lights.

## Features

- Create and manage multiple traffic lights at an intersection.
- Simulate traffic light color changes to control traffic flow.
- Handle scenarios where non-existing traffic lights are referenced.

## Usage

To use the Urban Traffic Management System:

1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Compile and run the `UrbanTrafficManagementSystem.java` file.
4. Follow the prompts to simulate traffic light color changes and observe the output.

## Example

```java
Intersection intersection = new Intersection();

// Add traffic lights to the intersection
intersection.addTrafficLight("TL1");
intersection.addTrafficLight("TL2");

// Simulate traffic light changes
intersection.changeTrafficLightColor("TL1", "Green");
intersection.changeTrafficLightColor("TL2", "Red");
intersection.changeTrafficLightColor("TL3", "Green"); // Non-existing traffic light

```

## Contributors

- Jeel patel
