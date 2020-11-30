
public class Friend
{
    private String nombre;
    private String sexo;
    private int edad;
    
    public Friend(String nombre, String sexo, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public boolean existeNombre(String name){
        return nombre.equals(name)? true:false;
    }
}
