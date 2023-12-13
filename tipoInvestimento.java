/**
 *
 * @author BRENDA
 * 
 * Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do 
investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a 
poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.

 */

import javax.swing.JOptionPane;

public class tipoInvestimento {

    public static void main(String args[]) {
        double inv = 0;
        while (inv !=1 || inv != 2)
        {
            JOptionPane.showMessageDialog(null, "Insira 1 para poupança ou 2 para renda fixa");
            inv = Double.parseDouble(JOptionPane.showInputDialog("Insira o tipo de investimento!"));
            if (inv == 1){
                double val = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para investimento na poupança!"));
                double vf = (val + (val * 0.3));
                JOptionPane.showMessageDialog(null, "Seu investimento terá como valor final " + vf + "reais");
                System.exit(0);
            } else if (inv == 2){
                double val = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor para investimento em renda fixa!"));
                double vf = (val + (val * 0.5));
                JOptionPane.showMessageDialog(null, "Seu investimento terá como valor final " + vf + "reais");
                System.exit(0);
        }
        }   
        
    }
}
