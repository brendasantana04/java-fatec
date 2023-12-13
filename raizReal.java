/**
 * @author HAINE
 *  Receba os coeficientes A, B e C de uma equa��o do 2� grau
(AX�+BX+C=0). Calcule e mostre as ra�zes reais (considerar que a
equa��o possue2 ra�zes).
 */
import javax.swing.JOptionPane;

public class raizReal {

    public static void main(String args[])
    {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do coeficiente C"));
                
        int d = ((b * b) - 4 * (a * c)); // calculo de delta
             
        if (d <= 0){
            JOptionPane.showMessageDialog(null,"N�o h� ra�zes reais");

        } else {
            int x1 = (int) (((-b) + Math.sqrt(d)) / (2 * a));
            int x2 = (int) (((-b) - Math.sqrt(d)) / (2 * a));
            JOptionPane.showMessageDialog(null,"As ra�zes reais s�o "+ x1 +" e "+ x2);
        }
    }
}
