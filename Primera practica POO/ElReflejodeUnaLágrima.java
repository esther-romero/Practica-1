
public class ElReflejodeUnaLágrima
{
    private int uniSavia,reflejoDeLagrima;
    private boolean encendido,apagado;
    public ElReflejodeUnaLágrima(){
        uniSavia = 0;
        encendido = false;
        apagado = true;
        reflejoDeLagrima = 0;
    }
    
    public void encenderMaquina(boolean encender){
        encendido = encender;
        if(encendido == true){
            apagado = false;
        }else{
            apagado = true;
        }
    }
    
    public void apagarMaquina(boolean apagar){
        apagado = apagar;
        if(apagado == true){
            encendido = false;
        }else{
            encendido = true;
        }
    }
    
    public String agregarSavia(int savia ){
        String res = "";
        if(encendido == true){
            uniSavia += savia;
            if(uniSavia >= 90){
                if(uniSavia == 90){
                    res = "Capacidad maxima alcanzada";
                }
                else if(uniSavia > 90){
                    uniSavia = uniSavia - 90;
                    res = "No se almaceno " + uniSavia + " unidad(es) de Savia, almacenamieto lleno";
                }
                uniSavia = 90;
            }else{
                res = "La acción ha sido completada con éxito";
            }
        }else{
            res = "La maquina no esta encendido";
        }
        
        return res;
    }
    
    public String crearComponente(){
        String res = "";
        if(encendido == true){
            if(uniSavia >= 50){
                if(reflejoDeLagrima < 20){
                   uniSavia -= 50;
                   reflejoDeLagrima += 1; 
                   res = "La acción ha sido completada con éxito";
                }else{
                    res = "“No puede realizar esa acción, espacio insuficiente";
                }
            }else{
                res = "No puede realizar esa acción, savia insuficiente";
            } 
        }else{
            res = "La maquina no esta encendido";
        }
        return res;
    } 
    
    public void retirarSavia(int retSavia){
        if(encendido == true)
            if(retSavia > uniSavia){
                uniSavia = 0;
            }else{
                uniSavia -= retSavia;
            }    
        else{
        }
    }
    
    public void retirarReflejo(int retReflejo){
        if(encendido == true)
            if(retReflejo > reflejoDeLagrima){
                reflejoDeLagrima = 0;
            }else{
                reflejoDeLagrima -= retReflejo;
            }
        else{
        }
    }
}
