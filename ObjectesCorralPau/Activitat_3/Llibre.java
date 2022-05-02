package Activitat_3;
public class Llibre {
    private String titol;
    private String autor;
    private int exemplars;
    private int prestec;
    

    //CONSTRUCTORS
    public Llibre() {
        this.titol = "";
        this.autor = "";
        this.exemplars = 0;
        this.prestec = 0;
    }
    
    public Llibre(String titolRebut, String autorRebut, int exemplarRebut, int prestecRebut) {
        this.titol = titolRebut;
        this.autor = autorRebut;
        this.exemplars = exemplarRebut;
        this.prestec = prestecRebut;
    }
    

    //GETTERS I SETTERS
    public String getTitol() {
        return this.titol;
    }
    
    public void setTitol(String titolRebut) {
        this.titol = titolRebut;
    }
    
    public String getAutor() {
        return this.autor;
    }
    
    public void setAutor(String autorRebut) {
        this.autor = autorRebut;
    }
    
    public int getExemplars() {
        return this.exemplars;
    }
    
    public void setExemplars(int exemplarsRebut) {
        this.exemplars = exemplarsRebut;
    }
    
    public int getPrestec() {
        return this.prestec;
    }
    
    public void setPrestec(int prestecRebut) {
        this.prestec = prestecRebut;
    }
    

    //TO STRING
    public String toString() {
        return "Llibre\n" 
        + " -- TITOL            = " +  this.titol + ",\n"
        + " -- AUTOR            = " +  this.autor + ",\n"
        + " -- EXEMPLARS        = " +  this.exemplars + ",\n"
        + " -- PRESTECS         = " +  this.prestec + "\n";
    }
    

    // MÈTODES
    // * -> agafarEnPrestec
    // * -> retornarDePrestec
    
    public void agafarEnPrestec(){
        if(this.prestec < this.exemplars){
            this.prestec ++;
        }
    }
    public void retornarDePrestec(){
        if((this.prestec <= this.exemplars) && (this.prestec > 0 )){
            this.prestec --;
        }
    }
}