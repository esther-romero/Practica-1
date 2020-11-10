
public class Ejercicio1
{
    public String contar(String cad){
        return contar(cad, "",cad.length()-1, 0);
    }
    
    private String contar(String cad, String cad2, int tam, int cont){
        String res;
        if(tam == -1){
            res = "La cantidad de palabras es:  " + cont + 
            ". Las primeras palabras son:  " + cad2;
        }else{
            char actual = cad.charAt(tam);
            if(actual == ' ' || actual == ',' || actual == '.'){
                cad2 = ","+cad2;
                res = contar(cad, cad2, tam-1,cont+=1);
            }else{
                cad2 = actual + cad2;
                res = contar(cad,cad2,tam-1,cont);
            }
        }
        return res;
    } 
}
