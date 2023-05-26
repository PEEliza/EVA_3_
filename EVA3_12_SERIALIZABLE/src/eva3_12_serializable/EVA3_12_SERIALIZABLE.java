
package eva3_12_serializable;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author pesca
 */
public class EVA3_12_SERIALIZABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        // TODO code application logic here
        try{
        Persona perso = new Persona("Eliza","Lopez",20);
        guardarObjetos(perso);
        Persona result = leerObjetos();
            System.out.println("Nombre: " + result.getName());
            System.out.println("Apellido: " + result.getApell());
            System.out.println("Edad: " + result.getEdad());
        } catch (IOException ex){
            
        } 
    }
   public static void guardarObjetos(Persona perso) throws FileNotFoundException, IOException{
        FileOutputStream abrirArchivo = new FileOutputStream("C:\\ARCHIVOS\\personas.per");
        ObjectOutputStream ouStream = new ObjectOutputStream(abrirArchivo);
      
        ouStream.writeObject(perso);
        ouStream.close();
   }
   public static Persona leerObjetos() throws FileNotFoundException, IOException, ClassNotFoundException{
       Persona perso = null;
       FileInputStream abrirArchivo = new FileInputStream("C:\\ARCHIVOS\\personas.per");
       ObjectInputStream oiStream = new ObjectInputStream(abrirArchivo);
       // casting: de objetc a perdona
       perso = (Persona)oiStream.readObject();
       return perso;
   }
}

class Persona implements Serializable{
  private String name;
  private String apell;
  private int edad;

    public Persona() {
    }

    public Persona(String name, String apell, int edad) {
        this.name = name;
        this.apell = apell;
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public String getApell() {
        return apell;
    }

    public int getEdad() {
        return edad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
  
  
}