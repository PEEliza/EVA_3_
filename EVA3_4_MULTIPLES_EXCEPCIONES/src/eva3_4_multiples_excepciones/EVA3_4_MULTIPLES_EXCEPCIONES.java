
package eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;


public class EVA3_4_MULTIPLES_EXCEPCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("INTRODUCE EL VALOR (ENTERO) DE X: ");
        x = input.nextInt();
        System.out.println("INTRODUCE EL VALOR DE (ENTERO) Y: ");
        y = input.nextInt();
        
        int result = x/y;
        System.out.println("LA DIVISIÓN DE" + x + "/" + y + "ES --> " + result);
       
        }catch(InputMismatchException e){
            System.out.println("LA CAPTURA ES INCORRECTA: " + e.getMessage());
       }catch (ArithmeticException e){  
            System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO: " + e.getMessage());
    }
        System.out.println("PROGRAMA FINALIZADO CON EXITO");
}
    
}
