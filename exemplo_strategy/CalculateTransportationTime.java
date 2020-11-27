public class CalculateTransportationTime {

    public static void main(String[] args) {

        float distance = 100;

        Transportation transportation = new Car();
        transportation.calculateTime(distance);

        transportation = new Bus();
        transportation.calculateTime(distance);

        transportation = new Bicycle();
        transportation.calculateTime(distance);
    }
}