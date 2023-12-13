/**
 *
 * @author BRENDA
 * 
 * Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não
necessariamente em ordem. Mostre os 4 números em ordem crescente.
 */

import javax.swing.JOptionPane;

public class exibeCrescente2 {

    public static void main(String args[]) {
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
        int v2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
            while (v2 < v1){
                v2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor maior que o primeiro"));
            }
            int v3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor"));
                while (v3 < v2){
                    v3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor maior que o segundo"));
                }
                int v4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o quarto valor"));
                
        JOptionPane.showMessageDialog(null, "Número em ordem crescente: ");
        if (v4 < v1){
            JOptionPane.showMessageDialog(null, v4+", "+ v1 +", "+ v2 +", "+ v3);
        } else if(v4 < v2){
            JOptionPane.showMessageDialog(null, v1+", "+ v4 +", "+ v2 +", "+ v3);
        } else if (v4 < v3){
            JOptionPane.showMessageDialog(null, v1+", "+ v2 +", "+ v4 +", "+ v3);
        } else {
            JOptionPane.showMessageDialog(null, v1+", "+ v2 +", "+ v3 +", "+ v4);
        }
    }
}
