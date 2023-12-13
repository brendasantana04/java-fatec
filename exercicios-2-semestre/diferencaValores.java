
/**
 *
 * @author HAINE
 * 
 * mostrar a diferenca entre os valores
 */
import javax.swing.JOptionPane;
        
public class diferencaValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
        
        if (n1 > n2){
            int dif = (n1 - n2);
            JOptionPane.showMessageDialog(null,"A diferença entre esses valores é de " + dif +" números.");
        }else {
            int dif = (n2 - n1);
            JOptionPane.showMessageDialog(null,"A diferença entre esses valores é de "+ dif +" números.");
        }
    }
}
