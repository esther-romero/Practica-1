
public class Insomnio
{
    public int calcular(){
        int duermenLosJovenes;
        
        int duermeHoras = 2;
        int duermeMinutos = 45;
        int despiertaHoras = 11;
        int despiertaMinutos = 25;
        
        int duermeTotalMinutos = duermeHoras*60 + duermeMinutos;
        int despiertaTotalMinutos = despiertaHoras*60 + despiertaMinutos;
        
        duermenLosJovenes = despiertaTotalMinutos - duermeTotalMinutos; 
        
        return duermenLosJovenes;
    }
}
