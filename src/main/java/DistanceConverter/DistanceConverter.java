package DistanceConverter;
import ConversionUtils.ConversionUtils;
public class DistanceConverter {
    public void convertAndPrint(double km) {
        System.out.println(km + " km em milhas: " + ConversionUtils.kmToMiles(km));
        System.out.println(km + " km em metros: " + ConversionUtils.kmToMeters(km));
        System.out.println(km + " km em centímetros: " + ConversionUtils.kmToCentimeters(km));
    }
}
