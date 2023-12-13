/**
 *
 * @author BRENDA
 * 
 * Calcule e mostre o quadrado dos números entre 10 e 150.
 */

import javax.swing.JOptionPane;

public class mostrarQuadrados {

    public static void main(String args[]) {
        double qd;
        
        for (int i = 10; i <= 150; i++ ){
            qd = (i * i);
            JOptionPane.showMessageDialog(null, "O quadrado de "+ i +" é "+qd);
        }        
    }
}
