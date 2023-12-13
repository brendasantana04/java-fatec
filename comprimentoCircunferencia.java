/**
 *
 * @author HAINE
 */

import javax.swing.JOptionPane;

public class comprimentoCircunferencia {

    public static void main(String args[]) {
        
        int r = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do raio do quadrado?"));
        
        //C = 2πr
        
        double c = (2 * Math.PI * r);
        
        JOptionPane.showMessageDialog(null, "O valor do comprimento da circunferencia é "+ c);
    }
}
