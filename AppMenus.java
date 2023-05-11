import utils_joan.GestioDeMenus; // Importem de la carpeta utils_joan, la Classe GestioDeMenus

public class AppMenus {
    public static void main(String[] args) {
        String[] nomMesos = {
            "gener","febrer","març",
            "abril","maig","juny",
            "juliol","agost","setembre",    
            "octubre","novembre","desembre"
        };

        int opcioEntrada;
        opcioEntrada = GestioDeMenus.entraOpcioMenu(nomMesos,"ESCULL UN MES","Entra una de les següents opcions");
        System.out.println("Has entrat l'opció " + opcioEntrada + " és a dir " + nomMesos[opcioEntrada-1]);
    }
}
