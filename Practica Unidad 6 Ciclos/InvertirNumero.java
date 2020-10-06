
/**
 * Write a description of class InvertirNumero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvertirNumero
{
    public int invertir(int numero){
        int invertido = 0, restante;
        while(numero > 0){
            restante = numero%10;
            invertido = invertido *10 + restante;
            numero = numero/10;
        }
        return invertido;
    }
}
