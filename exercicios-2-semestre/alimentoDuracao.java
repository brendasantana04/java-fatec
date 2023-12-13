/**
 *
 * @author HAINE
 * 
 */
import javax.swing.JOptionPane;
public class alimentoDuracao {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int alm = Integer.parseInt(JOptionPane.showInputDialog("Quantos quilos de alimento você consumirá?"));

        double dias = (alm / 0.05);
        
        JOptionPane.showMessageDialog(null, "Esse alimento vai durar "+ dias +" dias");
    }
}
