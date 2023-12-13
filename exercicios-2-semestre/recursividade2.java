/**
 *
 * @author BRENDA
 * 
 * serie2 = n = n-1 + n-2 + ... 1
 */

import javax.swing.JOptionPane;

public class recursividade2 {

    public static void main(String args[]) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para N"));
        int i = 0;
        
        Rec2(n,i);
        
    }
    
    public static int Rec2(int n, int i){
        
        if (n == 0){
            return n;
        }
        
        return n - Rec2(n, i + 1) ;
    }
}
