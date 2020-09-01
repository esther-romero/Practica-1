
public class ReglasDelHogar{
    public String miTurno(){
        String respuesta = "";
        int contador = 0;
        for(int i = 1; i<20;i++){
            if (i==15){
                break;
            }
            contador +=1;
        }
        
        respuesta = "Tienen que pasar " + contador + " dias";
        return respuesta;
    }
}
