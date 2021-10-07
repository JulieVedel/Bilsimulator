package com.company;

public class Bil {
    String biltype;
    String model;
    String stelnummer;
    int antalDøre;
    String softwareVersion;
    String gpsKoordinater;
    int hastighed;

    Rat rat = new Rat();
    Bremse bremse = new Bremse();
    Motor motor = new Motor(false);
    Hjul hjul = new Hjul();


    public Bil(String biltype, String model, String stelnummer, int antalDøre, String softwareVersion, String gpsKoordinater, int hastighed) {
        this.biltype = biltype;
        this.model = model;
        this.stelnummer = stelnummer;
        this.antalDøre = antalDøre;
        this.softwareVersion = softwareVersion;
        this.gpsKoordinater = gpsKoordinater;
        this.hastighed = hastighed;
    }

    public void motor() {
        boolean tænd = motor.isOnOff();
        if (tænd) {
            System.out.println("Motoren er tændt.");
        } else {
            System.out.println("Motor er slukket.");
        }
    }

    public void accelerer() {
        hastighed += 1;
        System.out.println("Du sætter farten op med 1 km/t, så din hastighed nu er " + hastighed + " km/t.");
    }

    public void brems() {
        hastighed -= 1;
        if (hastighed < 0) {
            System.out.println("Nu begynder du at bakke. Det må du ikke.");
            hastighed = 0;
        } else {
            System.out.println("Du sætter farten ned med 1 km/t, så din hastighed nu er " + hastighed + " km/t.");
        }
    }
    public void cruiseControl(int hastighedInput) {
        hastighed = hastighedInput;
        System.out.println("Din hastighed er nu " + hastighed + " km/t. ");
    }


















    public String getBiltype() {
        return biltype;
    }
    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getStelnummer() {
        return stelnummer;
    }
    public void setStelnummer(String stelnummer) {
        this.stelnummer = stelnummer;
    }

    public int getAntalDøre() {
        return antalDøre;
    }
    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }
    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getGpsKoordinater() {
        return gpsKoordinater;
    }
    public void setGpsKoordinater(String gpsKoordinater) {
        this.gpsKoordinater = gpsKoordinater;
    }

    public double getHastighed() {
        return hastighed;
    }
    public void setHastighed(int hastighed) {
        this.hastighed = hastighed;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "biltype='" + biltype + '\'' +
                ", model='" + model + '\'' +
                ", stelnummer='" + stelnummer + '\'' +
                ", antalDøre=" + antalDøre +
                ", softwareVersion='" + softwareVersion + '\'' +
                ", gpsKoordinater='" + gpsKoordinater + '\'' +
                ", hastighed=" + hastighed +
                '}';
    }
}
