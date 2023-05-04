import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
    // Atributs
    private String nom;
    private String cognom;
    private String telefon;
    private String correu;
    private Calendar dataNaixament;
    
    // Constructor
    public Persona(String nomRebut, String cognomRebut, String telefonRebut, String correuRebut, Calendar dataNaixamentRebuda) {
        this.nom = nomRebut;
        this.cognom = cognomRebut;
        this.telefon = telefonRebut;
        this.correu = correuRebut;
        this.dataNaixament = dataNaixamentRebuda;
    }


    // metodes

    // Getters

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nouNom){
        this.nom = nouNom;
    }

    public int calculaEdat() {
        Calendar avui = Calendar.getInstance();
        int difAnys = avui.get(Calendar.YEAR) - this.dataNaixament.get(Calendar.YEAR);
        int difMesos = avui.get(Calendar.MONTH) - this.dataNaixament.get(Calendar.MONTH);
        int difDies = avui.get(Calendar.DAY_OF_MONTH) - this.dataNaixament.get(Calendar.DAY_OF_MONTH);
        // Encara no a cumplert els anys!
        if (difMesos < 0 || (difMesos == 0 && difDies < 0)) {
            difAnys = difAnys - 1;
        }
        return difAnys;

    }
    public static void main(String[] args) {
        Calendar dataNaix = new GregorianCalendar(1984,05,15);
        
        Persona pers1;
        
        pers1 = new Persona("Joan", "Pardo", "64598755", "joanpardo@ginebro.cat", dataNaix);
        
        System.out.print("En " + pers1.nom + " té " + pers1.calculaEdat() + " anys!");
    }
}

