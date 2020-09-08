
public class AllendeElAlmayLosMares
{
    private int x,y,intentos;
    public AllendeElAlmayLosMares(){
        x = ((int)(Math.random()*10));
        y = ((int)(Math.random()*10));
        intentos = 0;
    }
    
    public String jugar(int x, int y){
        String res = "";
        String x2 = buscarX(x);
        String y2 = buscarY(y); 
        int inMax = 3;
        if(intentos < inMax){
           if(x2 == "esta en su posición" && y2 == "esta en su posición"){
               res = "Ganaste!!! Aquí esta tu tesoro";
           }else{
               res = "X "+ x2 + ", Y " + y2;
           }
           intentos += 1;
        }else if (intentos == inMax && (x2 != "esta en su posición" && y2 != "esta en su posición")){
            res = "Lo siento, perdiste, me saludas al Megalodon";
            intentos +=1;
        }else {
            res = "Lo siento, ya no puedes realizar mas intentos";
        }
        return res;
    }
    
    private String buscarX(int x1){
        String res = "";
        if(x1 == x ){
           res = "esta en su posición"; 
        }else if(x1 + 2 == x  || x1 - 2 == x){
            res = "esta cerca";
        }else if(x1 + 1 == x  || x1 - 1 == x){
            res = "esta cerca";
        }else if(x1 + 2 != x || x1 + 2 != x){
            res = "esta lejos";
        }
        return res;
    }
    
    private String buscarY(int y1){
        String res = "";
        if(y1 == y ){
           res = "esta en su posición"; 
        }else if(y1 + 2 == y  || y1 - 2 == y){
            res = "esta cerca";
        }else if(y1 + 1 == y  || y1 - 1 == y){
            res = "esta cerca";
        }else if(y1 + 2 != y || y1 + 2 != y){
            res = "esta lejos";
        }
        return res;
    }
    
    public void reiniciarJuego(){
        x = ((int)(Math.random()*10));
        y = ((int)(Math.random()*10));
        intentos = 0;
    }
    
    public int numeroIntentos(){
        int inten = intentos;
        return inten;
    }
}
