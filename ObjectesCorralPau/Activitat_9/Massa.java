package Activitat_9;

public class Massa {


    private double kilograms;


    //Constructors
    public Massa(double kilograms) {
        this.kilograms = kilograms;
    }

    public Massa(){
        this.kilograms = 0;
    }




    //Sistema Internacional
    //KILOGRAMS
    public double getKilograms() {
        return kilograms;
    }

    public void setKilograms(double kilograms) {
        this.kilograms = kilograms;
    }

    
    //GRAMS
    public double getGrams() {
        return kilograms * 1000;
    }

    public void setGrams(double grams) {
        this.kilograms = grams / 1000;
    }


    //MILIGARMS
    public double getMiliGrams() {
        return kilograms * 1000000;
    }

    public void setMiliGrams(double miligrams) {
        this.kilograms = miligrams / 1000000;
    }




// --------------------------------------------------------------------------------
    //Sistema Anglosaxó
    //TONA
    public double getTona() {
        return kilograms * 907.18474899;
    }

    public void setTona(double tona) {
        this.kilograms = tona / 907.18474899;
    }


    public double getLliura() {
        return kilograms * 45.359237;
    }

    public void setLliura(double lliura) {
        this.kilograms = lliura / 45.359237;
    }




    
}
