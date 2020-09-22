
public class Cumpleaño
{
    private int dia;
    private int mes;
    private int anio;
    
    public Cumpleaño(){
        dia = 0;
        mes = 0;
        anio = 0;
    }
    
    public String fechaLiteral(int dia,int mes, int anio){
        String res = "";
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        if(mes == 1){
            res = dia + " de enero de " + anio;
        }else if(mes == 2){
            res = dia + " de febrero de " + anio;
        }else if(mes == 3){
            res = dia + " de marzo de " + anio;
        }else if(mes == 4){
            res = dia + " de abril de " + anio;
        }else if(mes == 5){
            res = dia + " de mayo de " + anio;
        }else if(mes == 6){
            res = dia + " de junio de " + anio;
        }else if(mes == 7){
            res = dia + " de julio de " + anio;
        }else if(mes == 8){
            res = dia + " de agosto de " + anio;
        }else if(mes == 9){
            res = dia + " de septiembre de " + anio;
        }else if(mes == 10){
            res = dia + " de octubre de " + anio;
        }else if(mes == 11){
            res = dia + " de noviembre de " + anio;
        }else{
            res = dia + " de diciembre de " + anio;
        }
        return res;
    }
}
