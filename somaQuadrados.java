
/**
 *
 * @author HAINE
 * 
 */
import javax.swing.JOptionPane;
        
public class somaQuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número"));
        
        int sq = ((n1 * n1) + (n2 * n2));
        
        JOptionPane.showMessageDialog(null,"A soma dos quadrados desses números é " + sq);
    }
}
