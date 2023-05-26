
package eva3_6_finally;

public class EVA3_6_FINALLY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 9, y = 1;
        try{
        int result = x / y;
        System.out.println("RESULTADO: " + result);
        } catch(ArithmeticException e){
            System.out.println("NO SE PUEDE DIVIDIR ENTRE CERO");
        }finally{ // OBLIGA A LA EJECUCIÓN DE ESTA SECCIÓN DE CÓDIGO
            // ES OPCIONAL
            System.out.println("SIEMPRE ME VOY A EJECUTAR!!"); 
        }
        System.out.println("\nPROGRAMA FINALIZADO");       
    }
    
}
