/**
 * @author HAINE
 * Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 */
import javax.swing.JOptionPane;

public class areaTriangulo {

    public static void main(String args[])
    {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base do triangulo! "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura do triangulo! "));

        int area = (base * altura) / 2; // calculo triangulo
        
        JOptionPane.showMessageDialog(null,"O valor da área do triângulo é " + area);
    }
}
