/**
 *
 * @author BRENDA
 * 
 * Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem
crescente
 */

import javax.swing.JOptionPane;

public class exibeCrescente {

    public static void main(String args[]) {
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
        
        if (v1 > v2){
            JOptionPane.showMessageDialog(null, v2 + ", " + v1);
        } else{
            JOptionPane.showMessageDialog(null, v1 + ", " + v2);
        }
    }
}
