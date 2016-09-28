
public class Start {
    public static void main(String[] args) {
        TrafficLight traffColor = new TrafficLight(new Lamp(new Bulb(), Colors.REDLIGHT), new Lamp(new Bulb(), Colors.YELLOWLIGHT), new Lamp(new Bulb(), Colors.GREENLIGHT));
        Timer getTimeFromUser = new Timer();
        traffColor.getColor(getTimeFromUser.getHoursNumber());
        traffColor.light();
    }
}
