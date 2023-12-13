/**
 * @author HAINE
 *  Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
conteúdos.

 */
import javax.swing.JOptionPane;

public class trocaValores {

    public static void main(String args[])
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Atribua um valor para X"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Atribua um valor para Y"));
        
                
        int z = x; // guardando x em z
        x = y; // x possui valor de y
        y = z; // y possui valor de x
             
        JOptionPane.showMessageDialog(null,"X agora possui o valor de " + x + " e Y possui o valor de "+ y);
    }
}
