
public class AmalgamaDeFugacesRecuerdos
{
    private String tarea,marcar;
    private int contador;
    public AmalgamaDeFugacesRecuerdos(){
        tarea = "";
        marcar = "concluida";
        contador = 0;
    }
    
    public String nuevaActividad(String tarea){
        String res = "";
        if(marcar == "concluida"){
            this.tarea = tarea;
            marcar = "No concluida";
            res = "Nueva Tarea Asignada";
            contador += 1;
        }else{
            res = "La tarea en curso, aún no ha sido concluida";
        }
        return res;
    }
    
    public String marcar(){
        marcar = "concluida";
        return marcar;
    }
}
