import java.util.*;
public class AmigoComun
{
    ArrayList<Friend> amigo1;
    ArrayList<Friend> amigo2;
    ArrayList<String> comun;
    
    public AmigoComun(){
        amigo1 = new ArrayList<Friend>();
        amigo2 = new ArrayList<Friend>();
        comun = new ArrayList<String>();
    }
    
    public void agregarAmigo1(Friend otro){
        amigo1.add(otro);
    }
    
    public void agregarAmigo2(Friend otro){
        amigo2.add(otro);
    }
    
    public ArrayList<String> amigosEnComun(){
        comun();
        return comun;
    }
    
    private void comun(){
        int i = 0;
        while(i<amigo1.size()){
            String nombre1 = amigo1.get(i).getNombre();
            for(int j =0; j< amigo2.size(); j++){
                String nombre2 = amigo2.get(j).getNombre();
                if(nombre1.equals(nombre2) && buscar(nombre1) == false){
                    comun.add(nombre1);
                }
            }
            i++;
        }
    }
    
    private boolean buscar(String nombre){
        boolean encontre = false;
        int i = 0;
        while(i < comun.size() && encontre == false){
            if(comun.get(i).equals(nombre))
                 encontre = true; 
            i++;
        }
        return encontre;
    }
}
