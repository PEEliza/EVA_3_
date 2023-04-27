
package eva3_1_unchecked_exceptions;
// Autor: Poleth E. Escarcega Lopez

import java.util.Scanner;

public class EVA3_1_UNCHECKED_EXCEPTIONS {

    public static void main(String[] args) {
        // TODO code application logic here
// TODAS SON DE RUNTIMEEXCEPTION        

// ARITHMETIC EXCEPTIONS:
        // División entre cero
        System.out.println("INICIANDO PROGRAMA");
        int x = 5, y = 0;
        System.out.println("INICIALIZANDO LAS VARIABLES");
        int result = x / y;
        System.out.println("CALUCLANDO LA DIVISIÓN");
        System.out.println("División = " + result); 
     
// INPUTMISTMATCH EXCEPTIONS: ERROR DE CAPTURA DE DATOS
       Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num= input.nextInt();
        System.out.println("El numero es: " + num);
       
// INDEXOUTOFBOUNDS EXCEPTION
       int[] arreglo = new int [5]; // 0 -(N-1)
       arreglo[0] = 100;
       arreglo[1] = 200;
       arreglo[2] = 300;
       arreglo[3] = 400;
       arreglo[4] = 500;
       arreglo[5] = 600; // Error de lógica: 5 no es una posición válida*/
      
// NULLPOINTER EXCEPTION
      Prueba objPrueba = null;
        System.out.println("Valor de x = " + objPrueba.x);
    }
    
}
 class Prueba{
     public int x = 100;
 }