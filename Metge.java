import java.time.LocalDate;

public class Metge extends Persona {
    // Atributs
    private String especialitat;
    private int experiencia;
    
    // Constructor
    public Metge(String nomRebut, String cognomRebut, String telefonRebut, String correuRebut,
    LocalDate dataNaixamentRebuda, String especialitatRebuda, int experienciaRebuda){
        super(nomRebut, cognomRebut, telefonRebut, correuRebut, dataNaixamentRebuda);
        this.especialitat = especialitatRebuda;
        this.experiencia = experienciaRebuda;
    }
    // Mètodes
    // Getters i Setters
    public String getEspecialitat() {
        return especialitat;
    }

    public void setEspecialitat(String especialitat) {
        this.especialitat = especialitat;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    // Altres mètodes
    public void aumentarExperiencia(){
        this.experiencia ++;
    }
}
