/**
 * @author HAINE
 *  Receba os coeficientes A, B e C de uma equação do 2º grau
(AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a
equação possue2 raízes).
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
            JOptionPane.showMessageDialog(null,"Não há raízes reais");

        } else {
            int x1 = (int) (((-b) + Math.sqrt(d)) / (2 * a));
            int x2 = (int) (((-b) - Math.sqrt(d)) / (2 * a));
            JOptionPane.showMessageDialog(null,"As raízes reais são "+ x1 +" e "+ x2);
        }
    }
}
