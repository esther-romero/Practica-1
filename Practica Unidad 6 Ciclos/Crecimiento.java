

public class Crecimiento
{
    public String numeroAcarreo(int e1){
       String res = "";
       int entrada = e1;
       int num = 0;
       int num2 = 0;
       int num3 = 0;
       do{
            num = entrada%10;
            num2 = entrada/10;
            num3 = num2%10;
           if(num>num3 || num == num3){
               entrada = num2;
               res = "Esta en crecimiento";
           }else{
               res = "No esta en crecimiento";
           }
       }while( entrada> 0);
       return res;
    }
}
