package Activitat_1;

public class Cotxe {

    private String marca;
    private String model;
    private String color;
    private String matricula;

    // CONSTRUCTORS
    public Cotxe(String _marca, String _model, String _color) {
        this.marca = _marca;
        this.model = _model;
        this.color = _color;
        generarMatricula();
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

    public void generarMatricula() {

        char[] banned = {'E','I','O','U'};

        this.matricula = Integer.toString(randomNumbers(19999, 10000)).substring(1);
        for (int i = 0; i < 3; i++) {
            boolean esVocal = false;
            char lletra;
            do{
                esVocal = false;
                lletra = (char)randomNumbers(90, 66);
                for (char c : banned) {
                    if (lletra == c) esVocal = true;
                }
            }while(esVocal);

            this.matricula += lletra;
            
        }
    }



    //FER EL TO STRING
    public String toString() {
        return "Marca: " + marca + "\n" + "Model: " + model + "\n"+ "Color: " + color + "\n" +  "Matricula: " + matricula + "\n";
    }


    //FUNCIO PER FER RANDOM LLETRES I NUMEROS DE LA MATRICULA
    private int randomNumbers(int max, int min) {
        return (int) (Math.random() * (max - min) + min);
    }


}
