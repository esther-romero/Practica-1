
public class ElSenderoQuellegaAlZenith
{
    private int alcanceOptimo,durabilidad,contador;
    public ElSenderoQuellegaAlZenith(){
        alcanceOptimo = ((int)(Math.random()*10));
        durabilidad = ((int)(Math.random()*100));
        contador = 0;
    }
    
    private ElSenderoQuellegaAlZenith(int alcanceOpti, int dura){
        alcanceOptimo = alcanceOpti;
        durabilidad = dura;
    }
    
    public String observar(){
        String retorna = "";
        int probabilidad = ((int)(Math.random()*100));
        if(probabilidad >= 1 && probabilidad <=65){
            retorna = "Objeto en Movimiento Detectado";
            contador += 1;
        }else {
            retorna = "El intento ha Fallado";
        }
        return retorna;
    }
    
    public ElSenderoQuellegaAlZenith combinarModulos(ElSenderoQuellegaAlZenith otra){
        ElSenderoQuellegaAlZenith combinar;
        int alcanceC = this.alcanceOptimo + otra.alcanceOptimo;
        int durabiliC = Math.min(this.durabilidad,otra.durabilidad);
        combinar = new ElSenderoQuellegaAlZenith(alcanceC,durabiliC);
        return combinar;
    }
    
    
}
