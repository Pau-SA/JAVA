public class Moto extends Vehicle {

    String manillar;
    int numeroSeients;

    public Moto(String _tipus, String _marca, String _model, int _any, String _manillar, int _numeroSeients) {

        super(_tipus, _marca, _model, _any);
        this.manillar = _manillar;
        this.numeroSeients = _numeroSeients;

    }


    // COMPONENTS/PART
    public String getManillarMoto() {
        return manillar;
    }

    public void setManillarMoto(String _manillar) {
        manillar = _manillar;
    }

    public int getNumeroSeients() {
        return numeroSeients;
    }

    public void setNumeroSeients(int _numeroSeients) {
        numeroSeients = _numeroSeients;
    }



    public String toString() {
        return "Tipus: " + tipus + "\n" + "Marca: " + marca + "\n" + "Model: " + model + "\n" + "Any: " + any + "\n"
                + "Manillar: " + manillar + "\n" + "Numero Seients: " + numeroSeients;
    }
}
