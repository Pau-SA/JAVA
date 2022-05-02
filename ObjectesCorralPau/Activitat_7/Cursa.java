package Activitat_7;

public class Cursa {

    private float metres;
    private float voltes;

    public Cursa() {
        this.metres = 0;
        this.voltes = 0;
    }

    public Cursa(float metres) {
        this.metres = metres;
        this.voltes = voltes;
    }

    public float getMetres() {
        return metres;
    }

    public void setMetres(float metres) {
        this.metres = metres;
    }

    public float getVoltes() {
        return voltes;
    }

    public void setVoltes(float voltes) {
        this.voltes = voltes;
    }

    // INCREMENTAR VOLTES
    public void incrementarVolta() {

        this.voltes++;

    }

    public void incrementarVolta(float voltesPositives) {
        this.voltes += voltesPositives;
    }

    // DECREMENTAR VOLTES
    public void decrementarVolta() {

        this.voltes--;
        if (this.voltes < 0) {
            this.voltes = 0;
        }

    }

    public void decrementarVolta(float voltesNegatives) {

        this.voltes -= voltesNegatives;

        if (this.voltes < 0) {
            this.voltes = 0;
        }

    }

    // DISTÀNCIA
    public float distanciaRecorreguda() {

        return this.voltes * this.metres;

    }

    // TO STING
    public String toString() {
        return "\n"
                + " -- Metres = " + this.metres + "\n"
                + " -- Voltes = " + this.voltes + "\n";
    }

}
