/**
 *
 * @author BRENDA
 * 
 * Receba 2 valores reais. Calcule e mostre o maior deles.
 */

import javax.swing.JOptionPane;
        
public class maiorReal {

    public static void main(String args[]) {
        
        float v1 = Float.parseFloat(JOptionPane.showInputDialog("Insira o primeiro valor real"));
        float v2 = Float.parseFloat(JOptionPane.showInputDialog("Insira o segundo valor real"));
        
        if (v1 > v2){
            JOptionPane.showMessageDialog(null, "O maior entre eles é o "+ v1);
        } else {
            JOptionPane.showMessageDialog(null, "O maior entre eles é o "+ v2);
        }
    }
}
