/**
 * @author HAINE
 * Receba a base e a altura de um tri�ngulo. Calcule e mostre a sua �rea.
 */
import javax.swing.JOptionPane;

public class areaTriangulo {

    public static void main(String args[])
    {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base do triangulo! "));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura do triangulo! "));

        int area = (base * altura) / 2; // calculo triangulo
        
        JOptionPane.showMessageDialog(null,"O valor da �rea do tri�ngulo � " + area);
    }
}
