/**
 * @author HAINE
 * Receba a temperatura em graus Celsius. Calcule e mostre a sua
temperatura convertida em fahrenheit F = (9*C+160) /5
 */
import javax.swing.JOptionPane;

public class celsiusFahrenheit {

    public static void main(String args[])
    {
        int c = Integer.parseInt(JOptionPane.showInputDialog("Insira uma temperatura em Celsius!"));
        
        int f = (9 * c + 160) / 5; // convertendo celsius para fahrenheit
        
        JOptionPane.showMessageDialog(null,"O valor em Celsius que era de "+ c +" em fahrenheit é "+ f);
    }
}
