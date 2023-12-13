/**
 * @author HAINE
 * Coletar o valor do lado de um quadrado, calcular sua área e apresentar o
 * resultado
 */
import javax.swing.JOptionPane;

public class areaQuadrado {

    public static void main(String args[])
    {
        int lado = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do lado do quadrado! "));
        
        int area = (lado * lado); // calculo da area
        
        JOptionPane.showMessageDialog(null,"A área do quadrado é " + area);
    }
}
