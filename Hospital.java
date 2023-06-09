import java.time.LocalDate;

public class Hospital {
    // Atributs
    private String nom;
    private int qtatMaxLlits;
    private Metge[] llistaMetges;
    private Pacient[] llistaPacients;
    
    // Constructor
    public Hospital(String nomRebut, int qtatMaxLlitsRebuda) {
        this.nom = nomRebut;
        this.qtatMaxLlits = qtatMaxLlitsRebuda;
    }

    // Mètodes
    // Getters i Setters

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nouNom) {
        this.nom = nouNom;
    }

    public int getQtatMaxLlits() {
        return qtatMaxLlits;
    }

    public void setQtatMaxLlits(int qtatMaxLlits) {
        this.qtatMaxLlits = qtatMaxLlits;
    }

    public Metge[] getLlistaMetges() {
        return llistaMetges;
    }

    public void setLlistaMetges(Metge[] llistaMetges) {
        this.llistaMetges = llistaMetges;
    }

    public Pacient[] getLlistaPacients() {
        return llistaPacients;
    }

    public void setLlistaPacients(Pacient[] llistaPacients) {
        this.llistaPacients = llistaPacients;
    }

    // Altres mètodes
}
