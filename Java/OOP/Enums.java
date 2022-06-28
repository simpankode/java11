package OOP;

public class Enums {
    
    enum TrafficLights {
        
        Red, Yellow, Green;
        
    }

    public static void main(String[] args) {
        
        TrafficLights myTrafficLight = TrafficLights.Red;

        System.out.println(myTrafficLight);

        //statement
        switch (myTrafficLight) {
            case Red:
                System.out.println("Stop");
                break;
            case Yellow:
                System.out.println("Slow down");
                break;
            case Green:
                System.out.println("Go");
                break;
            default:
                System.out.println("Error");
                break;
        }

        //loop
        for (TrafficLights mytTrafficLight : TrafficLights.values()) {
            
            System.out.println(mytTrafficLight);
        }
    }
}
