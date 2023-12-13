/**
 *
 * @author HAINE
 */
import javax.swing.JOptionPane;

public class terceiroAngulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int ang1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do primeiro ângulo"));
        int ang2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do segundo ângulo"));
        
        int ang3 = (180 - (ang1 + ang2));
        
        JOptionPane.showMessageDialog(null, "O terceiro ângulo desse triângulo mede "+ ang3 +" graus"); 
    }
}
