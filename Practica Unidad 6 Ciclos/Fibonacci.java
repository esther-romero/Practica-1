
/**
 * Write a description of class Fibonacci here.
 * 
 * @author Esther Romero Aguilar
 * @version (a version number or a date)
 */
public class Fibonacci
{
    public int probar(int n){
        int anterior = 0;
        int posterior =1;
        int auxi;
        for(int i = 0; i<=n;i++){
            auxi = anterior;
            anterior = posterior+ anterior;
            posterior = auxi;
        }
        return posterior;
    }
}
