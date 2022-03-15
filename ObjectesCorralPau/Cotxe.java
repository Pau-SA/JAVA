public class Cotxe extends Vehicle {

    private String pneumatic;
    private String motor;


    //CONSTRUCTOR
    public Cotxe(String _tipus, String _marca, String _model, int _any, String _pneumatic, String _motor){
        super(_tipus, _marca, _model, _any);
        this.pneumatic = _pneumatic;
        this.motor = _motor;
    }



    //COMPONENTS/PART
    public String getPneumatic(){
        return pneumatic;
    }

    public void setPneumatic(String _pneumatic){
        pneumatic = _pneumatic;
    }


    public String getMotor(){
        return motor;
    }

    public void setMotor(String _motor){
        motor = _motor;
    }



    public String toString(){
        return "Tipus: " + tipus + "\n" + "Marca: " + marca + "\n" + "Model: " + model + "\n" + "Any: " + any + "\n" + "Pneumatic: " + pneumatic + "\n" + "Motor: " + motor;
    }

}