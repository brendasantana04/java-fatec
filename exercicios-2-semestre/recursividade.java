/**
 *
 * @author BRENDA
 * 
 * serie1 = (1 + 2 + 3 ... 100)
 * 
 */


public class recursividade {

    public static void main(String args[]) {
        
       int x = 1; 
       
       Rec1(x);
    }
    
    public static int Rec1(int x){
        
    if (x == 100){
        return x;
    }
    
    return Rec1(x + 1);
    }
}
