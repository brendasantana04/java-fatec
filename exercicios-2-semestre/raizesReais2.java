/**
 *
 * @author BRENDA
 * 
 * Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula
AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso
exista, calcule e mostre.
* 
 */

import javax.swing.JOptionPane;

public class raizesReais2 {
    public static void main(String args[]) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeiro coeficiente da equacao"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo coeficiente da equacao"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro coeficiente da equacao"));
        
        int d = ((b * b) - 4 * (a * c)); // calculo de delta
        
        if (d < 0){
            JOptionPane.showMessageDialog(null,"Nao possui raizes reais");

        } else {
            int x1 = (int) (((-b) + Math.sqrt(d)) / (2 * a));
            int x2 = (int) (((-b) - Math.sqrt(d)) / (2 * a));
            JOptionPane.showMessageDialog(null,"As raizes reais sao "+ x1 +" e "+ x2);
        }
    }
}
