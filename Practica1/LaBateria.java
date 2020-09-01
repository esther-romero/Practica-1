
public class LaBateria{
    public double tiempo(){
        double bateria = 55;
        
        double redes   = 10; //1hora
        int juegos  = 20; //1hora
        int youtube = 15; //1hora
        
        int juega = 30; //minutos
        int redSo = 15; //minutos
        int videos = 40;//minutos
        
        juegos = (juega * juegos)/60;
        redes = (redSo * redes)/60;
        youtube = (videos * youtube)/60;
        
        double totalTime = (juegos + redes + youtube);
        
        bateria = bateria - totalTime;
        return bateria; 
    }
}
