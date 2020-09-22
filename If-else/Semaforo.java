
public class Semaforo{
    private String red, yellow, green, estado;
    int cont;
    public Semaforo(){
        red = "rojo";
        yellow = "amarillo";
        green = "verde";
        estado = "rojo";
    }
    
    public void cambiar(){
        if(cont == 0){
            estado = "verde";
            cont += 1;
        }else if(cont == 1){
            estado = "amarillo";
            cont +=1;
        }else if(cont == 2){
            estado = "rojo";
            cont = 0;
        }
    }
    
    public String colorActual(){
        String res = estado;
        return res;
    }
}
