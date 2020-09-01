
public class ElYoutuber
{
    public String calcularDuracion(){
        String respuesta = "";
        double durMax = 15;
        double mini = 2.30;
        double max = 3.00;
        
        int cantidad1 = (int)(durMax/max);
        int cantidad2 = (int)(durMax/mini);
        
        int cancionesMax = Math.max(cantidad1,cantidad2);
        respuesta = "La cantidad de canciones maximas que pueden entrar a ser parte del video son: " + 
                     cancionesMax;
        return respuesta;
    }
}
