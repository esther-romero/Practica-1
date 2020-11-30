import java.util.*;
public class ListaDeEstudiantes
{
    private ArrayList<Estudiante> lista;
    private ArrayList<Estudiante> aprobado;
    private ArrayList<Estudiante> reprobado;
    private ArrayList<Estudiante> segundaInstancia;
    public ListaDeEstudiantes(){
        lista = new ArrayList<Estudiante>();
        aprobado = new ArrayList<Estudiante>();
        reprobado = new ArrayList<Estudiante>();
        segundaInstancia = new ArrayList<Estudiante>();
    }
    
    public boolean agregarEstudiantes(Estudiante otro){
        boolean res = false;
        String nombre = otro.getNombre();
        String apellido = otro.getApellido();
        if(buscar(nombre, apellido) == false){
            lista.add(otro);
            res = true;
            repartir(otro);
        }
        return res;
    }
    
    private boolean buscar(String nombre, String apellido){
        boolean encontre = false;
        int i = 0;
        while(i < lista.size() && encontre == false){
            if(lista.get(i).existeNombre(nombre) == true && 
            lista.get(i).existeApellido(apellido) == true)
                 encontre = true;
            i++;
        }
        return encontre;
    }
    
    public ArrayList<Estudiante> aprobados(){
        return aprobado;
    }
    
    public ArrayList<Estudiante> reprobado(){
        return reprobado;
    }
    
    public ArrayList<Estudiante> segundaInstancia(){
        return segundaInstancia;
    }
    
    public void repartir(Estudiante otro){
        int i = 0;
        while(i<lista.size()){
            if(lista.get(i).promedio() >= 51){
                aprobado.add(otro);
                segundaInstancia.add(otro);
            }else if(lista.get(i).promedio() <= 50){
                reprobado.add(otro);
                if(lista.get(i).promedio() >= 26){
                    segundaInstancia.add(otro);
                }
            }
            i++;
        }
    }
}
