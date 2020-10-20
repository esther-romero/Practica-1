
public class AlOtroLadoDelVortice
{
    public String calcularVortice(int []arr){
        int mayor = 0;
        int menor = arr[0];
        String res= "";
        int arrMenor = 0;
        int arrMayor = 0;
        for(int i = 0; i< arr.length; i++){
            if(menor> arr[i]){
                menor = arr[i];
                arrMenor = i;
            }else if(mayor < arr[i]){
                mayor = arr[i];
                arrMayor = i;
            }
        }
        
        for(int i = arrMenor; i<= arrMayor; i++){
           res += arr[i]+ " , ";
        }
        return "El vertice esta formado por los numeros: " + res;
    }
}
