package org.example;
import DistanceConverter.DistanceConverter;

public class App
{
    public static void main(String[] args) {
        DistanceConverter converter = new DistanceConverter();
        converter.convertAndPrint(6.0);
    }
}
