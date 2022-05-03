package Activitat_9;

public class Longitud {
    private double metres;




    //CONSTRUCTORS
    public Longitud(double metres) {
        this.metres = metres;
    }
    public Longitud() {
        this.metres = 0;
    }
 

    


    //GETTERS I SETTERS

    //Sistema Internacional
    public double getMetres() {
        return metres;
    }
    public void setMetres(double metres) {
        this.metres = metres;
    }



    public void setKM(double kilometresRebuts){
        this.metres = kilometresRebuts * 1000;
    }
    public double getKM(){
        return this.metres / 1000;
    }


        
    public void setCM(double cmRebuts){
        this.metres = cmRebuts / 100;
    }
    public double getCM(){
        return this.metres * 100;
    }


    // ex: 3000mm --> 3m
    public void setMM(double mmRebuts){
        this.metres = mmRebuts / 1000;
    }

    // ex: 3mm --> 3000mm
    public double getMM(){
        return this.metres * 1000;
    }


// --------------------------------------------------------------------------------
    //Sistema Anglosaxó
    public void setLlegues(double llegues){
        this.metres = llegues *  4828.032;
    }
    public double getLlegues(){
        return this.metres / 4828.032;
    }


    public void setMilles(double milles){
        this.metres = milles *  1609.344;
    }
    public double getMilles(){
        return this.metres / 1609.344;
    }



    public void setIarda(double iarda){
        this.metres = iarda *  0.9144;
    }
    public double getIarda(){
        return this.metres / 0.9144;
    }



    public void setPeu(double peu){
        this.metres = peu *  0.3048;
    }
    public double getPeu(){
        return this.metres / 0.3048;
    }


    
    public void setPolzada(double polzada){
        this.metres = polzada *  0.0254 ;
    }
    public double getPolzada(){
        return this.metres / 0.0254;
    }

    









}
