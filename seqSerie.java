/**
 *
 * @author BRENDA
 * 
 * Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * 
 */

import javax.swing.JOptionPane;

public class seqSerie {

    public static void main(String args[]) {
        
        int n, i;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
        
        for (i = 1; i <= n; i ++){
            JOptionPane.showMessageDialog(null, "1/"+i);
        }
        
    }
}
