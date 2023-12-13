/**
 * @author HAINE
 * Receba o salário de um funcionário e mostre o novo salário com reajuste
de 15%.
 */
import javax.swing.JOptionPane;

public class reajusteSalario {

    public static void main(String args[])
    {
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do seu salário! "));
        
        int reajuste = (int) (salario + (salario * 0.15)); // reajuste de 15% 
        
        JOptionPane.showMessageDialog(null,"O novo salário com reajuste é " + reajuste);
    }
}
