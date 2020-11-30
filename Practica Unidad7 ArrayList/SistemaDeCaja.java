import java.util.*;
public class SistemaDeCaja
{
    private String caja;
    private int numero;
    private int contador;
    private ArrayList<String> ficha;
    private ArrayList<String> fichaAtendida;
    public SistemaDeCaja(){
        caja = "C1 - 0";
        numero = 0;
        contador = 0;
        ficha = new ArrayList();
        fichaAtendida = new ArrayList();
    }
    
    public String generarFicha(){
        numero = numero+1;
        String fi = caja + numero;
        ficha.add(fi);
        return fi;
    }
    
    public String atenderFicha(int t){
        String res;
        for(int i = 0; i<t; i++){
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
        if(!ficha.isEmpty()){
            String f = ficha.get(contador);
            fichaAtendida.add(f);
            ficha.remove(0);
            res = "Se atendio la ficha ";
        }else{
            res = null;
        }
        contador = contador + 1;
        return res;
    }
    
    public ArrayList<String> getFichasAtendidas(){
        return fichaAtendida;
    }
}
