import java.time.LocalDate;

public class Pacient extends Persona {
    // Atributs
    private String malaltia;
    private int visites;
    
    // Constructor
    public Pacient(String nomRebut, String cognomRebut,
                   String telefonRebut, String correuRebut,
                   LocalDate dataNaixamentRebuda,
                   String malaltiaRebuda, int visitesRebudes){
        super(nomRebut, cognomRebut, telefonRebut, correuRebut,  dataNaixamentRebuda);
        this.malaltia = malaltiaRebuda;
        this.visites = visitesRebudes;
    }
    // Mètodes
    // Getters i Setters
    public String getMalaltia() {
        return malaltia;
    }
    public void setMalaltia(String malaltia) {
        this.malaltia = malaltia;
    }
    public int getVisites() {
        return visites;
    }
    public void setVisites(int visites) {
        this.visites = visites;
    }

    // Altres mètodes
    public void aumentarVisites(){
        this.visites ++;
    }


}
