package Activitat_3;

public class Llibre {
    
    private String titol;
    private String autor;
    private int exemplars;
    private int prestecs;



    public Llibre(String _titol, String _autor, int _exemplars, int _prestecs){
        this.titol = _titol;
        this.autor = _autor;
        this.exemplars = _exemplars;
        this.prestecs = _prestecs;

    } 


    public Llibre(){
        this.titol = "";
        this.autor = "";
        this.exemplars = 0;
        this.prestecs = 0;
    } 



    public String GetTitol(){
        return titol;
    }

    public void SetTitol(String _titol){
        this.titol = _titol;
    }



    public String GetAutor(){
        return autor;
    }
    public void SetActor(String _autor){
        this.autor = _autor;
    }


    public int GetExemplars(){
        return exemplars;
    }
    public void SetExemplars(int _exemplars){
        this.exemplars = _exemplars;
    }


    public int GetPrestecs(){
        return prestecs;
    }
    public void SetPrestecs(int _prestecs){
        this.prestecs = _prestecs;
    }




    public String toString() {
        return "Titol: " + titol + "\n" + "Autor: " + autor + "\n"+ "Exemplars: " + exemplars + "\n" +  "Prestecs: " + prestecs + "\n";
    }



    public void agafarEnPrestec(){

        if(this.prestecs < this.exemplars){
            this.prestecs++;
        }

        // if(exemplarsRebuts > 0){
        //     exemplarsRebuts--;
        //     prestecsRebuts++;
        // }

        // this.exemplars = exemplarsRebuts;
        // this.prestecs = prestecsRebuts;
        
    }

    public void retornarDePrestec(){

        // exemplarsRebuts++;
        // prestecsRebuts--;
        
        // this.exemplars = exemplarsRebuts;
        // this.prestecs = prestecsRebuts;

        if((this.prestecs <= this.exemplars) && (this.prestecs > 0)){
            this.prestecs--;
        }

        
    }

}