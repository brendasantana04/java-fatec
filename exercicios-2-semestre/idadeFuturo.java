/**
 *
 * @author HAINE
 */

import javax.swing.JOptionPane;

public class idadeFuturo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        // TODO code application logic here
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual"));
        int nas = Integer.parseInt(JOptionPane.showInputDialog("Qual ano você nasceu?"));
        
        int id = (ano - nas);
        int idf = (id + 17);
        
        JOptionPane.showMessageDialog(null, "Você tem "+ id +" anos e daqui a 17 anos terá "+ idf +" anos");
    }
}
