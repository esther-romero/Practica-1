
public class Autobus
{
    public String cantViajes(){
        String respuesta = "";
        int pase = 45;
        double sinViaje = 1.80;
        int viaje = (int)(pase/sinViaje);
        respuesta = "Tendria que viajar " + viaje + " dias por mes.";
        return respuesta;
    }
}
