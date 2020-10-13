
public class Acarreo{
    public int numeroAcarreo(int e1, int e2){
       int num = 0;
       int cont = 0;
       int entrada = e1;
       do{
           num = entrada%10;
           if(num == 9){
               cont += 1;
               num = entrada/10;
               entrada = num;
           }else{
               num = entrada/10;
               entrada = num;
           }
       }while( entrada> 0);
       return cont;
    }
}
