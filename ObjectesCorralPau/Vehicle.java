public class Vehicle {

    String tipus;
    String marca;
    String model;
    int any;

    public Vehicle(String _tipus, String _marca, String _model, int _any) {
        this.tipus = _tipus;
        this.marca = _marca;
        this.model = _model;
        this.any = _any;
    }

    // TIPUS
    public String getTipus() {
        return tipus;
    }

    public void setTipus(String _tipus) {
        this.tipus = _tipus;
    }

    // MARCA
    public String getMarca() {
        return marca;
    }

    public void setMarca(String _marca) {
        this.marca = _marca;
    }

    // MODEL
    public String getModel() {
        return model;
    }

    public void setModel(String _model) {
        this.model = _model;
    }

    // ANY
    public int getAny() {
        return this.any;
    }

    public void setAny(int _any) {
        this.any = _any;
    }

}