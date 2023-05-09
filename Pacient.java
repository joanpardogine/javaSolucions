import java.util.Calendar;

public class Pacient extends Persona {
    // Atributs
    private String malaltia;
    private int visites;

    // Constructor
    public Pacient(String nomRebut, String cognomRebut, String telefonRebut, String correuRebut, Calendar dataNaixamentRebuda, String malaltiaRebuda, int visitesRebudes){
        super(nomRebut, cognomRebut, telefonRebut, correuRebut,  dataNaixamentRebuda);
        this.malaltia = malaltiaRebuda;
        this.visites = visitesRebudes;
    }
    // Mètodes
    public void aumentarVisites(){
        this.visites ++;
    }

    // Getters

}
