
package aula02;

/**
 *
 * @author eduar
 */
public class Aula02 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        //c1.destampar();
        c1.rabiscar();
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Dea";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
