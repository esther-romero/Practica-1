
public class Ejercicio5
{
    public int contarBaches(String cadena){
        return contarBaches(cadena, 0, 0);
    }
    
    private int contarBaches(String cad, int pos, int contador){
        int res = 0;
        if(pos == cad.length()-1){
            res = contador;
        }else{
            int numActual = cad.charAt(pos) - '0';
            if(numActual == 0){
                int numSig = cad.charAt(pos+1) - '0';
                if(numSig == 1){
                    res = contarBaches(cad,pos+1,contador+1);
                }else{
                    res = contarBaches(cad,pos+1,contador);
                }
            }else{
                res = contarBaches(cad,pos+1,contador);
            }
        }
        return res; 
    }
}
