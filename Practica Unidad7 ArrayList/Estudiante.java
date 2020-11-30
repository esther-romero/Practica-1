
public class Estudiante
{
    private String nombre;
    private String apellido;
    private int nota1;
    private int nota2;
    
    public Estudiante(String nombre, String apellido, int p1, int p2){
        this.nombre = nombre;
        this.apellido = apellido;
        nota1 = p1;
        nota2 = p2;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public int promedio(){
        int prom = nota1+ nota2;
        prom = prom/2;
        return prom;
    }
    
    public boolean existeNombre(String name){
        return nombre.equals(name)? true:false;
    }
    
    public boolean existeApellido(String surname){
        return apellido.equals(surname)? true:false;
    }
}
