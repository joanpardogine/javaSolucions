import java.time.LocalDate;

public class Persona {
    // Atributs
    private String nom;
    private String cognom;
    private String telefon;
    private String correu;
    private LocalDate dataNaixament;

    // Constructor
    public Persona(String nomRebut, String cognomRebut, String telefonRebut, String correuRebut,
            LocalDate dataNaixamentRebuda) {
        this.nom = nomRebut;
        this.cognom = cognomRebut;
        this.telefon = telefonRebut;
        this.correu = correuRebut;
        this.dataNaixament = dataNaixamentRebuda;
    }

    // Mètodes
    // Getters i Setters

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nouNom) {
        this.nom = nouNom;
    }

    public String getCognom() {
        return this.cognom;
    }

    public void setCognom(String nouCognom) {
        this.cognom = nouCognom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public LocalDate getDataNaixament() {
        return this.dataNaixament;
    }

    public void setDataDeNaixament(LocalDate novaDataNaixament) {
        this.dataNaixament = novaDataNaixament;
    }

    // Altres mètodes

    public int calculaEdat() {
        LocalDate avui = LocalDate.now();
        int difAnys = avui.getYear() - this.dataNaixament.getYear();
        int difMesos = avui.getMonthValue() - this.dataNaixament.getMonthValue();
        int difDies = avui.getDayOfMonth() - this.dataNaixament.getDayOfMonth();
        // Encara no a cumplert els anys!
        if (difMesos < 0 || (difMesos == 0 && difDies < 0)) {
            difAnys = difAnys - 1;
        }
        return difAnys;
    }
}
