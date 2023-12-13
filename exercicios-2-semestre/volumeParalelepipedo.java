/**
 * @author HAINE
 *  Receba os valores do comprimento, largura e altura de um paralelep�pedo.
Calcule e mostre seu volume..

 */
import javax.swing.JOptionPane;

public class volumeParalelepipedo {

    public static void main(String args[])
    {
        int c = Integer.parseInt(JOptionPane.showInputDialog("Atribua o valor do comprimento"));
        int l = Integer.parseInt(JOptionPane.showInputDialog("Atribua o valor da largura"));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Atribua o valor da altura"));

        int v = (c * l * a);// volume
             
        JOptionPane.showMessageDialog(null,"O volume do paralelepípedo é "+ v +" m³");
    }
}
