
public class ElPresagioDeMeredith
{
    private int n, m,intentos, contador;
    private int matriz[][];
    
    public ElPresagioDeMeredith(int n, int m){
        this.n = n;
        this.m = m;
        intentos = 6;
        contador = 0;
        matriz = new int[n][m];
    }
    
    public int aleatorio(){
        int num = (int)(Math.random()*10);
        return num;
    }
    
    private String simbolo(int num){
        String res = "";
        if(num>0 && num<2)
            res = "diamante";
        else if(num>2 && num<5)
            res = "corazon";
        else if(num>5 && num<7)
            res = "espada";
        else{
            res = "trebol";
        }
        return res;
    }
    
    private void llenar(){
        int dato;
        dato = aleatorio();
        for(int f = 0; f < n; f++){
            for(int c = 0; c < m; c++){
                matriz[f][c] = dato;
                dato = aleatorio();
            }
        }
    }
    
    private int getNum(int f, int c){
        int num = matriz[f][c];
        return num;
    }
    
    public String atinar(int num, String simbolo, int fila, int columna){
        llenar();
        String res = "";
        if(intentos>0){
            if(getNum(fila,columna) == num){
                if(simbolo(num).equals(simbolo(getNum(fila,columna)))){
                    intentos -=1; 
                    contador +=1;
                    res = "Mas 1 punto, te quedan "+ intentos + " intentos.";
                }else{
                    intentos -=1;
                    res = "Menos 1 punto, te quedan "+ intentos + " intentos.";
                }
            }else{
                intentos -=1;
                res = "Menos 1 punto, te quedan "+ intentos + " intentos.";
            }
        }else{
            intentos -=1;
            res = "Te quedaste sin intentos, te quedan "+ intentos + " intentos.";
        }
        return res;
    }
    
    public int consultaPuntaje(){
        return contador;
    }
}
