
package eva3_8_custom_exceptions;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

/**
 *
 * @author pesca
 */

// EXEPTION DE TIPO UNCHECKED (RuntimeException)
public class Persona {
  private String nom;
  private String apell;
  private int edad;

    public Persona() {
        this.nom = "---";
        this.apell = "---";
        this.edad = 0;        
    }

    public Persona(String nom, String apell, int edad) {
        this.nom = nom;
        this.apell = apell;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public String getApell() {
        return apell;
    }

    public int getEdad() {
        return edad;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public void setEdad(int edad) throws DatoEntradaCheckedEx {
        if(edad < 0)
            //throw new DatoEntradaException();
            throw new DatoEntradaCheckedEx();
        this.edad = edad;
        
    }
  
  
}

class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("DATO DE ENTRADA INCORRECTO!! El valor debe ser positivo");
        
    }
    
}

class DatoEntradaCheckedEx extends Exception{
    
    public DatoEntradaCheckedEx(){
      super("DATO DE ENTRADA INCORRECTO!! El valor debe ser positivo");
    }
}