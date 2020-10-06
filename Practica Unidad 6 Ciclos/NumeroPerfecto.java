
/**
 * Write a description of class NumeroPerfecto here.
 * 
 * @author Esther Romero Aguilar
 * @version (a version number or a date)
 */
public class NumeroPerfecto{
    public boolean perfecto(int num){
        boolean perfect = false;
        int cont = 0;
        for(int i = 1; i< num; i++){
            if(num%i == 0){
                cont = cont + i;
            }
        }
        return perfect = cont == num;
    }
}
