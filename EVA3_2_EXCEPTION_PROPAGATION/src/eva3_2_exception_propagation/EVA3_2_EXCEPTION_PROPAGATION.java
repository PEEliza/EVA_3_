
package eva3_2_exception_propagation;
// AUTOR: Poleth E. Escarecga Lopez
public class EVA3_2_EXCEPTION_PROPAGATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA MAIN");
        A();
        System.out.println("TERMINA MAIN");
    }
  public static void A(){
      System.out.println("INICIA A");
      B();
      System.out.println("TERMINA A");
}
public static void B(){
    System.out.println("INICIA B");
    C();
    System.out.println("TERMINA B");
}  
public static void C(){
    System.out.println("INICIA C");
    int x = 5, y =0;
    int result = x/y;
    System.out.println("RESULTADO = " + result);
    System.out.println("TERMINA C");
}
}

