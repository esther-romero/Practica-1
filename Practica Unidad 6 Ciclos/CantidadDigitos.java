
/**
 * Write a description of class CantidadDigitos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CantidadDigitos{
     
    public int contar(int num){
        int cont=0;
        do{
            cont ++;
            num = num/10;
        }while(num > 0);
        
        return cont;
    }
}
