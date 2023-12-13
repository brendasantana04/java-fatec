/**
 *
 * @author BRENDA
 * 
 * serie3 = 1/1 + 1/2 + 1/3 ... 1/n
 * 
 */

import javax.swing.JOptionPane;

public class recursividade3 {

    public static void main(String args[]) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para N"));
        int i = 0;
        
        Rec3(n,i);
    }
    
    public static int Rec3(int n, int i){
        
        if (i == n){
            return n;
        }
        
        return 1 / Rec3(n, i + 1);
    }
}
