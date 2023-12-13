/**
 *
 * @author BRENDA
 * 
 * Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 */

import javax.swing.JOptionPane;

public class seqUm {

    public static void main(String args[]) {
        double n, i, fat;
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Insira um número qualquer"));
        
        for (i = 0; i <= n; i++){
            fat = n * (n-1);
            
            JOptionPane.showMessageDialog(null, "1/"+fat);
        }
        
    }
}
