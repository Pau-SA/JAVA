package Activitat_2;
public class Compte {

    
    private String titular;
    private float quantitat;

    public void ingressar(float quantitatRebuda){

        if(this.quantitat >= 0){
            this.quantitat += quantitatRebuda; // quantitat = quantitat + quantitatRebuda
        }
        
                            //SI ES COMPLEIX             SINO FARA AIXÒ
        // this.quantitat = (this.quantitat > 0)? 0 : quantitat + quantitatRebuda;
    }


    public void retirar(float quantitatARetirar){

        // this.quantitat = ((this.quantitat - quantitatARetirar) < 0)? 0 : quantitat - quantitatARetirar;

        if((quantitat - quantitatARetirar) < 0){
            this.quantitat = 0;
        }else{
            this.quantitat -= quantitatARetirar; // quantitat = quantitat - quantitatARetirar

        }
    }



    //TO STRING
    public String toString() {
        return "Titular: " + titular + "\n" + "Quantitat: " + quantitat + "\n" ;
    }



    //CONSTRUCTORS
    public Compte(){
        this.titular = "";
        this.quantitat = 0;
    }
    
    public Compte(String _titular, float _quantitat) {
        this.titular = _titular;
        this.quantitat = _quantitat;
    }

    public Compte(String _titular) {
        this.titular = _titular;
    }






    //GETTRS I SETTERS
    public String getTitular() {
        return titular;
    }
    public void setTitular(String _titular) {
        this.titular = _titular;
    }
    public float getQuantitat() {
        return quantitat;
    }
    public void setQuantitat(float _quantitat) {
        this.quantitat = _quantitat;
    }
    
}