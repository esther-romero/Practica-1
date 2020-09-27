
public class Digito{
    private int num;
    private int primerDigito;
    public Digito(){
        num = 0;
        primerDigito = 0;
    }
    
    public int verificar(int numero){
        num = numero;
        primerDigito = num/100;
        return primerDigito;
    }
    
    
}
