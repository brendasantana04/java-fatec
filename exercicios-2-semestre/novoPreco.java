/**
 * @author BRENDA
 */

import javax.swing.JOptionPane;

public class novoPreco {

    public static void main(String args[]) {
        float pA = Float.parseFloat(JOptionPane.showInputDialog("Insira o preço atual do produto"));
        float pM = Float.parseFloat(JOptionPane.showInputDialog("Insira a média de vendas do produto"));
        
        if ((pM < 500) && (pA < 30)){
            float pN = (pA + (10% pA));
            JOptionPane.showMessageDialog(null, "O novo preço é de "+ pN +" reais");
        } else if (((pM >= 500) && (pM < 1000)) && ((pA >= 30) && (pA < 80))){
            float pN = (pA + (15% pA));
            JOptionPane.showMessageDialog(null, "O novo preço é de "+ pN +" reais");
        } else if ((pM >= 1000) && (pA >= 80)){
            float pN = (pA - (5% pA));
            JOptionPane.showMessageDialog(null, "O novo preço é de "+ pN +" reais");
        } else {
            JOptionPane.showMessageDialog(null, "O novo preço é o mesmo que o preço atual, "+ pA +" reais");
        }
    }
}
