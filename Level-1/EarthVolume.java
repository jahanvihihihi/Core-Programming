public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;  
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        double kmToMiles = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f", volumeKm3, volumeMiles3);
    }
}
