
public class UnaCálidayTenueMelodíadeAmor
{
    private String cancion,estado;
    private int numCancion;
    public UnaCálidayTenueMelodíadeAmor(){
        cancion = "Sin Cancion";
        estado = "en pausa";
        numCancion = 0;
    }
    
    public String reproducirCancion(){
        String res = "";
        if(estado == "en pausa"){
            res = "La Canción ha empezado a sonar";
            estado = "reproduciendo";
        }else{
            res = "Ya está sonando una canción";
        }
        return res;
    }
    
    public String pausarCancion(){
        String res = "";
        if(estado == "reproduciendo"){
            res = "La canción ha sido Pausada";
            estado = "en pausa";
        }else{
            res = "La canción ya se encuentra en Pausa";
        }
        return res;
    }
    
    public String cambiarCancion(){
        numCancion = numCancion + 1;
        cancion = "";
        if(numCancion == 1){
            cancion = "Indestructibles - La Habitacion Roja";
        }else if(numCancion == 2){
            cancion = "Crazy - Gnarls Barkley";
        }else if(numCancion == 3){
            cancion = "I Follow Rivers - Likke Li";
            numCancion = 0;
        }
        return cancion;
    }
    
    public String nombreDeLaCancionActual(){
        String song = cancion;
        return song;
    }
}
