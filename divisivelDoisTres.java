/**
 *
 * @author HAINE
 * 
 * Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3
 */
import javax.swing.JOptionPane;
public class divisivelDoisTres {

    public static void main(String args[]) {
        int val = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor inteiro"));
        
        int val1 = (val % 2);
        int val2 = (val % 3);
        
        if ((val1 == 0) & (val2 == 0)){
            JOptionPane.showMessageDialog(null, "Esse número é divisível por 2 e 3");
        } else {
            JOptionPane.showMessageDialog(null, "Esse numero não é divisivel por 2 e 3");
        }
    }
}
