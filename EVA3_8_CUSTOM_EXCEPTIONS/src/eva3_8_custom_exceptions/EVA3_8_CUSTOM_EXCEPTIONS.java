
package eva3_8_custom_exceptions;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
/**
 *
 * @author pesca
 */
public class EVA3_8_CUSTOM_EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNom("Carlos");
        perso.setApell("Reyes");
        try{
        perso.setEdad(-26);
        } catch(DatoEntradaCheckedEx e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
