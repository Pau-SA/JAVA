package Activitat_1;

public class Cotxe {

    private String marca;
    private String model;
    private String color;
    private String matricula;

    // CONSTRUCTORS
    public Cotxe(String _marca, String _model, int _color) {
        this.marca = _marca;
        this.model = _model;
        this.color = _color;
    }

    public Cotxe() {
        this.marca = "";
        this.model = "";
        this.color = "";
        this.matricula = "";
    }

    // GETTERS I SETTERS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String _marca) {
        marca = _marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String _model) {
        model = _model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String _color) {
        color = _color;
    }

    public void matricula() {

        int max = 19999;
        int min = 10000;
        char abecedari[] = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'Y', 'Z'};
        String lletresMatricula;

        int numerosMatricula = (int) (Math.random() * (max - min) + min);
        lletresMatricula = Character.toString(tornaLletra() + Character.toString(tornaLletra()) +  Character.toString(tornaLletra())) ;

    }

    private char tornaLletra() {
        return (char)(Math.random() * (90 - 66) + 66);
    }

}
