
package eva3_9_leer_archivos_txt;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


/**
 *
 * @author pesca
 */
public class EVA3_9_LEER_ARCHIVOS_TXT {
 final static String RUTA = "C:\\ARCHIVOS\\PROGRA.txt";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            readUsingFiles(RUTA);
        } catch(IOException ex){
            ex.printStackTrace();
        }
        /*
        FILES: Se lee todo el contenido del archivo y se transfiere a memoria
        principal (RAM)
        Util con archivos pequeños
        */
    }
  public static void readUsingFiles(String ruta) throws IOException {
//CONSTRUIMOS LA RUTA EN BASE A LA CADENA DE TEXTO
      Path path = Paths.get(ruta);
     /*List <String> todasLineas = Files.readAllLines(path);
      System.out.println("RESULTADO:");
     // System.out.println(todasLineas.toString());
      for (int i = 0; i < todasLineas.size(); i++) {
          System.out.println(todasLineas.get(i));
*/
     byte[] bytes = Files.readAllBytes(path);
      System.out.println(new String(bytes));
      }
  } 

