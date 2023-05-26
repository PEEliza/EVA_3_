
package eva3_13_append;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author pesca
 */
public class EVA3_13_APPEND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String ruta = "C:\\ARCHIVOS\\";
 
        try {
           writeUsingBufferedWriter(ruta + "Archivo FilesBufferedWriter.txt"," Esta es una prueba de escritutra de un archivo, USANDO BUFFEREDWRITER!!!");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_13_APPEND.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
      public static void writeUsingBufferedWriter(String ruta, String datos) throws IOException{
       File file = new File(ruta);
       FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufWriter = new BufferedWriter(fileWriter);
         for (int i = 0; i < 10; i++) {
            bufWriter.write(i + datos);
            bufWriter.write("\n");
         }
         bufWriter.close();
         fileWriter.close(); 
      }
}
