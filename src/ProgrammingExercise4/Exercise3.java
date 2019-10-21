package ProgrammingExercise4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        // Charlotte
        double charLat = 35.2270869;
        double charLong = -80.8431267;

        // Savannah
        double savaLat = 2.0835407;
        double savaLong = -81.0998342;

        // Atlanta
        double atlaLat = 33.7489954;
        double atlaLong = -84.3879824;

        // Orlando
        double orlaLat = 8.5383355;
        double orlaLong = -81.3792365;

       // First triangle: Charlotte, Orlando, Atlanta

        // Charlotte to Atlanta
        double distCharToAtla = computeGreatCircleDistance(charLat, charLong, atlaLat, atlaLong);

        // Atlanta to Orlando
        double distAtlaToOrla = computeGreatCircleDistance(atlaLat, atlaLong, orlaLat, orlaLong);

        // Orlando to Charlotte
        double distOrlaToChar = computeGreatCircleDistance(orlaLat, orlaLong, charLat, charLong);

        // Compute area
        double area1 = computeAreaTriangle(distCharToAtla, distAtlaToOrla, distOrlaToChar);


        // Second triangle: Charlotte, Savannah, Orlando

        // Charlotte to Savannah
        double distCharToSava = computeGreatCircleDistance(charLat, charLong, savaLat, savaLong);

        // Savannah to Orlando
        double distSavaToOrla = computeGreatCircleDistance(savaLat, savaLong, orlaLat, orlaLong);

        // Compute area
        double area2 = computeAreaTriangle(distCharToSava, distSavaToOrla, distOrlaToChar);


        System.out.println("The estimated area enclosed by the four cities is: " + (area1 + area2) + " km squared");
    }

    public static double computeGreatCircleDistance (double x1, double y1, double x2, double y2) {
        x1 = Math.toRadians(x1);
        x2 = Math.toRadians(x2);
        y1 = Math.toRadians(y1);
        y2 = Math.toRadians(y2);

        double radius = 6371.01;
        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        return d;
    }

    public static double computeAreaTriangle (double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2.0;

        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        return area;
    }
}
