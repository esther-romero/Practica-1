
public class Bisiesto
{
    private int anio;
    private boolean bisiesto;
    public Bisiesto(){
        anio = 0;
        bisiesto = false;
    }
    
    public boolean anioBisiesto(int anio){
        this.anio = anio;
        if((anio % 4 == 0) && (anio%100 !=0 || anio % 400 == 0 )){
           bisiesto  = true;
        }else{
           bisiesto  = false;
        }
        return bisiesto;
    }
}
