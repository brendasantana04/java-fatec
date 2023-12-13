/**
 *
 * @author BRENDA
 * 
 * Receba um n�mero inteiro. Calcule e mostre o seu fatorial
 */

import javax.swing.JOptionPane;

public class calcFatorial {

    public static void main(String args[]) {
        double fat = 1, n, i = 1;
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Insira um numero para receber o fatorial"));
        
        for (i = 1; i <= n; i++){
            fat = fat * i;
        }        

        JOptionPane.showMessageDialog(null, "O fatorial de "+ n +" e "+ fat);
    }
}
