
public class ElLlantoDeLasEstrellas
{
    private int aux2; 
    public int[] ordenar(int []arr){
        for(int i =1; i<=arr.length;i++){
            for(int j = 0; j<=arr.length -1-i;j++){
                if(arr[j] > arr[j+1] && arr[j]%2 != 0 )
                {
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
        arr = ordenarPar(arr);
        return arr;
    }
    
    public int[] ordenarPar(int []arr){
        int tamanio = arr.length;
        for(int i =1; i<=arr.length;i++){
            for(int j = 0; j<=arr.length -1-i;j++){
                if(arr[j] < arr[j+1] && arr[j]%2 == 0)
                {
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }else{
                    if( arr[j]%2 == 0 && arr[j] < arr[j+1])
                    {
                        int aux = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = aux;
                    }
                }
            }
        }
        return arr;
    }
}