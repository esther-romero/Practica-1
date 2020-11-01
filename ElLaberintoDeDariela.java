

public class ElLaberintoDeDariela
{
    private int n,m,posX,posY;
    private char matriz[][];
    
    public ElLaberintoDeDariela(int filas, int columnas){
        n = filas;
        m = columnas;
        posX = 0;
        posY = 0;
        matriz = new char [n][m];
    }
    
    private int numRandom(){
        int num = (int)(Math.random()*10);
        return num/5;
    }
    
    public void empezarOreiniciar(){
        int dato;
        dato = numRandom();
        for(int f = 0; f < n; f++){
            for(int c = 0; c < m; c++){
                if(dato == 1)
                    matriz[f][c] = '-';
                else if(dato == 0){
                    matriz[f][c] = 'M';
                }else{
                    matriz[f][c] = '-';
                }
                dato = numRandom();
            }
        }
        posX = 0;
        posY = 0;
        matriz[posX][posY] = 'D';
        mostrar();
    }
     
    private void mostrar(){
        for(int f = 0; f<n; f++){
            for(int c = 0; c<m; c++){
                System.out.print(matriz[f][c]+"  ");
            }
            System.out.println();
        }
    }
    
    public void moverDerecha(){
        moverDerecha(posX,posY);
    }
    
    private void moverDerecha(int x, int y){
        if(y+1 != m){
            char posSig = matriz[x][y+1];
            if(posSig != 'M'){
                char aux = matriz[x][y];
                matriz[x][y] = matriz[x][y+1];
                matriz[x][y+1] = aux;
                posY +=1;
            }
        }
        mostrar();
    }
    
    public void moverIzquierda(){
        moverIzquierda(posX,posY);
    }
    
    private void moverIzquierda(int x, int y){
        if(y-1 != -1){
            char posAnt = matriz[x][y-1];
            if(posAnt != 'M'){
                char aux = matriz[x][y];
                matriz[x][y] = matriz[x][y-1];
                matriz[x][y-1] = aux;
                posY -=1;
            }
        }
        mostrar();
    }
    
    public void moverArriba(){
        moverArriba(posX,posY);
    }
    
    private void moverArriba(int x, int y){
        if(x-1 != -1){
            char posAnt = matriz[x-1][y];
            if(posAnt != 'M'){
                char aux = matriz[x][y];
                matriz[x][y] = matriz[x-1][y];
                matriz[x-1][y] = aux;
                posX -=1;
            }
        }
        mostrar();
    }
    
    public void moverAbajo(){
        moverAbajo(posX,posY);
    }
    
    private void moverAbajo(int x, int y){
        if(x+1 != n){
            char posSig = matriz[x+1][y];
            if(posSig != 'M'){
                char aux = matriz[x][y];
                matriz[x][y] = matriz[x+1][y];
                matriz[x+1][y] = aux;
                posX +=1;
            }
        }
        mostrar();
    }
}
