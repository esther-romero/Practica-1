
/**
 * Write a description of class Primo here.
 * 
 * @author Esther Romero Aguila 
 * @version (a version number or a date)
 */
public class Primo{
    public boolean primo(int num){
        boolean res = false;
        int contador = 0;
        for(int i = 1; i<= num;i++){
            if(num%i == 0){
                contador ++;
            }
        }
        return res = contador == 2 && num != 1;
    }
    
}
