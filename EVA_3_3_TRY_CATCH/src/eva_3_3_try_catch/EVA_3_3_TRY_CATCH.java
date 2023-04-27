
package eva_3_3_try_catch;
// AUTOR: Poleth E. Escarecga Lopez
public class EVA_3_3_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x= 5, y= 0;
        try{
        int result = x/y;
        System.out.println("EL RESULTADO ES = " + result);
        } 
        catch(ArithmeticException e){
            System.out.println("EXCEPCIÓN: " + e.getMessage());
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
