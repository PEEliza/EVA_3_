
package eva3_7_throw_exception;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_7_THROW_EXCEPTION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Prueba obj = new Prueba();
        try {
            // Checked: Es forzoso resolverlas
            // Unchecked: Errores de lógicas, no es forzoso resolverlas
            obj.capturaMayorcero(100);
            System.out.println("INTRODUCE UN VALOR: ");
            Scanner input = new Scanner(System.in);
            int valor = input.nextInt();
        } catch (Exception ex) { // NO ES BUENO USAR EXCEPTION, YA QUE ES LA SUPER
            System.out.println(ex.getMessage());
        }
        
        try{
        obj.division(100, 0);
        // ARITHMETIC EXCEPTION ES "UNCHECKED" NO ES OBLIGATORIO CAPTURAR
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}

class Prueba{
    // EXCEPTION ES CHECKED EXCEPTION, ESTAMOS OBLIGADOS A ATENDERLO
    public void capturaMayorcero(int valor) throws Exception{
        if(valor <= 0) // VOY A GENERAR UNA EXCEPCIÓN 
            throw new Exception(valor + " ES NEGATIVO, solo se aceptan valores positivos" );
        System.out.println("El valor es --> " + valor);
    }
    public int division(int x, int y) throws ArithmeticException{
     if( y == 0)
         throw new ArithmeticException("EL VALOR DEL DIVISOR ES CERO, ES INVÁLIDO!!");
        return x / y;
    }
}