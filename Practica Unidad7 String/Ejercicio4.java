
public class Ejercicio4
{
    public String simplificar(String cadena){
        return simplificar(cadena, 0,"");
    }
    
    private String simplificar(String cadena, int pos, String cad2){
        String res = "";
        if(pos == cadena.length()-1){
            res = cad2;
        }else{
            char actual = cadena.charAt(pos);
            if(esLetra(actual) == true){
                char sig = cadena.charAt(pos+1);
                if(sig == ' '){
                    cad2 = cad2 + actual + " ";
                    res = simplificar(cadena, pos+1,cad2);
                }else{
                    cad2 = cad2+actual;
                    res = simplificar(cadena, pos+1,cad2);
                }
            }else{
                res = simplificar(cadena, pos+1,cad2);
            }
        }
        return res;
    }
    
    private boolean esLetra(char c){
        boolean res;
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            res = true;
        else
            res = false;
        return res;
    }
}
