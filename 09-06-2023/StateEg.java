package com.deda;

class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new RedState(this);
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void performAction() {
        state.switchLights();
    }
}

interface TrafficLightState {
    void switchLights();
}


class RedState implements TrafficLightState {
    private final TrafficLight trafficLight;

    public RedState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void switchLights() {
        System.out.println("Light is red.Stop");
        trafficLight.setState(new GreenState(trafficLight));
    }
}

class GreenState implements TrafficLightState {
    private final TrafficLight trafficLight;

    public GreenState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void switchLights() {
        System.out.println("Light is green.Go");
        trafficLight.setState(new YellowState(trafficLight));
    }
}

class YellowState implements TrafficLightState {
    private final TrafficLight trafficLight;

    public YellowState(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public void switchLights() {
        System.out.println("Light is yellow.Get ready");
        trafficLight.setState(new RedState(trafficLight));
    }
}
public class StateEg{
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.performAction(); 
        trafficLight.performAction(); 
        trafficLight.performAction();
        trafficLight.performAction(); 
    }
}