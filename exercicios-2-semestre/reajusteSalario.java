/**
 * @author HAINE
 * Receba o sal�rio de um funcion�rio e mostre o novo sal�rio com reajuste
de 15%.
 */
import javax.swing.JOptionPane;

public class reajusteSalario {

    public static void main(String args[])
    {
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do seu sal�rio! "));
        
        int reajuste = (int) (salario + (salario * 0.15)); // reajuste de 15% 
        
        JOptionPane.showMessageDialog(null,"O novo sal�rio com reajuste � " + reajuste);
    }
}
