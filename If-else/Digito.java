
public class Digito{
    private int num;
    private int primerDigito;
    public Digito(){
        num = 0;
        primerDigito = 0;
    }
    
    public int verificar(int numero){
        num = numero;
        primerDigito = 0;
        int nume = contar(numero);
        if(nume == 3){
            primerDigito = num/100;
        }else if(nume == 4){
            primerDigito = num/1000;
        }else if(nume == 5){
            primerDigito = num/10000;
        }else if(nume == 6){
            primerDigito = num/100000;
        }else if(nume == 7){
            primerDigito = num/1000000;
        }else if(nume == 8){
            primerDigito = num/10000000;
        }else if(nume == 9){
            primerDigito = num/100000000;
        }
        return primerDigito;
    }
    
    private int contar(int nume){
        int res = nume;
        long num = 1000;
        int cont = 0;
        if(nume/num == 0){
            cont = 3;
        }else if(nume/(num + 9000) == 0){
            cont = 4;
        }else if(nume/(num + 99000) == 0){
            cont = 5;
        }else if(nume/(num + 999000)==0){
            cont = 6;
        }else if(nume/(num + 9999000)==0){
            cont = 7;
        }else if(nume/(num + 99999000)==0){
            cont = 8;
        }else if(nume/(num + 999999000)==0){
            cont = 9;
        }
        return cont;
    }
    
}
