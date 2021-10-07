package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bil dytten = new Bil("Tesla", "Model 3", "12345678", 5, "0.0.1", "25.812, 77.741", 0);
        String kommando = "Venter på kommando (fx start, stop, accelerer, brems, drej, status): ";
        boolean stop = false;

        System.out.println("Bilobjekt er oprettet.\n");
        System.out.println("Biltype: " + dytten.biltype);
        System.out.println("Model: " + dytten.model);
        System.out.println("Stelnummer: " + dytten.stelnummer);
        System.out.println("Antal døre: " + dytten.antalDøre);
        System.out.println("SoftwareVersion: " + dytten.softwareVersion);
        System.out.println("GPS koordinater: " + dytten.gpsKoordinater);
        System.out.println("Hastighed: " + dytten.hastighed + " km/t\n");


        while (!(stop)) {
            System.out.println(kommando);
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("start")) {
                if (dytten.motor.onOff) {
                    System.out.println("Du må ikke starte bilen igen!");
                } else {
                    dytten.motor.setOnOff(true);
                    dytten.motor();
                }
            } else if (input.equals("accelerer")) {
                dytten.accelerer();

            } else if (input.equals("brems")) {
                System.out.println("Vil du selv sætte en bestemt hastighed? Skriv ja eller nej.");
                dytten.brems();

            } else if (input.equals("drej")) {

            } else if (input.equals("status")) {

            } else if (input.equals("stop")) {
                stop = true;
                dytten.motor.setOnOff(false);
                dytten.motor();
            } else {
                System.out.println("Du har intastet en ugyldig kommando.");
            }
        }
    }
}
