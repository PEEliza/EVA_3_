
package eva3_5_captura;

import java.util.InputMismatchException;
import java.util.Scanner;


public class EVA3_5_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here    
        int x;
        do{
           try{
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE EL VALOR (ENTERO) DE X: ");
        x = input.nextInt();      
        break;
           } catch(InputMismatchException e){
               System.out.println("NO se introdujo un número válido, vuelve a capturarlo.");
           }
        }while(true);
        System.out.println("VALOR DE X = " + x);
        
    }
    
}
