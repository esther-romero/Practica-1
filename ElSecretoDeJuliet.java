
public class ElSecretoDeJuliet
{
    private int matriz[][];
    private int n, m, tesoro, tiburoncin;
    public ElSecretoDeJuliet(int n, int m){
        this.n = n;
        this.m = m;
        tesoro = 0;
        tiburoncin = 0;
        matriz = new int[n][m];
    }
    
    public int aleatorio(){
        int num = (int)(Math.random()*10);
        return num/5;
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
    
    private String adivinar(int num){
        return num==0? "tiburon" : "tesoro";
    }
    
    private int getNum(int n, int m){
        int num = matriz[n][m];
        return num;
    }
    
    public String develarSecreto(int fila, int columna){
        llenar();
        int num = getNum(fila,columna);
        String res = adivinar(num);
        if(tiburoncin == 3){
            res = "Perdiste";
        }else{
            if(res.equals("tiburon")){
                tesoro = 0;
                tiburoncin +=1;
            }else{
                tesoro += 50;
            }
        }
        return res;
    }
    
    public int consultaTesoro(){
        return tesoro;
    }
}
