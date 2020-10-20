
public class AnomaliaEnEquilibrio{
    private int ini;
    private int fin;
    private int medio;
    private int arr[];
    public AnomaliaEnEquilibrio(){
        ini = 0;
        fin = 0;
        medio = 0;
    }
    
    public int desequilibrio(int [] arreglo){
        arr = arreglo;
        int izquierda;
        int derecha;
        fin = arreglo.length-1;
        do{            
            medio = (fin-ini)/2;
            izquierda = suma(ini,medio);
            derecha = suma(medio+1,fin);
            if(izquierda>derecha){
                fin = medio;
            }else{
                ini = medio+1;
            }
        }while (ini != fin); 
        
        ini = buscar(ini);
        return ini;
    }
    
    private int suma(int ini, int fin){
        int suma = 0;
        for(int i = ini; i<=fin; i++){
            suma = suma + arr[i];
        }
        return suma;
    }
    
    public int buscar(int n){
        int res = 0;
        for(int i = 0; i<= arr.length; i++){
            if(n == i)
                res = arr[i]; 
        }
        return res;
    }
}
