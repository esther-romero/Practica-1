
public class Crecimiento{
    private int num;
    private String res;
    
    public Crecimiento(){
        num = 0;
        res = "";
    }
    
    public String verificar(int numero){
        num = numero;
        int uD = num%10;
        int eN = num/10;
        int pD = eN%10;
        if(pD < uD || pD == uD){
            res = "Crecimiento";
        }else{
            res = "No es de crecimiento";
        }
        return res;
    }
}
