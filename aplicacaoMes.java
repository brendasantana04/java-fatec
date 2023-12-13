
/**
 *
 * @author HAINE
 * aplicacao que rende 1,3%
 */

import javax.swing.JOptionPane;
        
public class aplicacaoMes {

    public static void main(String args[]) {
        
        int dep = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor para depósito para a poupança"));
                
        double apl = (dep * 1.013);
        
        JOptionPane.showMessageDialog(null,"Em um mês o valor da aplicação fica " + apl);

    }
}
