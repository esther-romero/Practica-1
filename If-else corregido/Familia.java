
public class Familia{
    String nombreHermano1;
    String nombreHermano2;
    String nombreHermano3;
    int edadHermano1;
    int edadHermano2;
    int edadHermano3;
    public Familia( String nombreHermano1, String nombreHermano2,
    String nombreHermano3, int edadHermano1,int edadHermano2,int edadHermano3){
        this.nombreHermano1 = nombreHermano1;
        this.nombreHermano2 = nombreHermano2;
        this.nombreHermano3 = nombreHermano3;
        this.edadHermano1 = edadHermano1;
        this.edadHermano2 = edadHermano2;
        this.edadHermano3 = edadHermano3;
    }
    
    public String reporte(){
        String reporte = "";
        if(edadHermano1>edadHermano2 && edadHermano2>edadHermano3){
            reporte = (nombreHermano1 +" es el/la mayor, "+ nombreHermano2 +
            " es el/la del medio " + nombreHermano3 + " es el/la menor.");
        }else if(edadHermano2>edadHermano1 && edadHermano1>edadHermano3)
        {
            reporte = (nombreHermano2 +" es el/la mayor, "+ nombreHermano1 +
            " es el/la del medio " + nombreHermano3 + " es el/la menor.");
        }else if(edadHermano3>edadHermano1 && edadHermano1>edadHermano2)
        {
            reporte = (nombreHermano3 +" es el/la mayor, "+ nombreHermano1 +
            " es el/la del medio " + nombreHermano2 + " es el/la menor.");
        }else if(edadHermano1>edadHermano3 && edadHermano3>edadHermano2)
        {
            reporte = (nombreHermano1 +" es el/la mayor, "+ nombreHermano3 +
            " es el/la del medio " + nombreHermano2 + " es el/la menor.");
        }else if(edadHermano2>edadHermano3 && edadHermano3>edadHermano1)
        {
            reporte = (nombreHermano2 +" es el/la mayor, "+ nombreHermano3 +
            " es el/la del medio " + nombreHermano1 + " es el/la menor.");
        }else if(edadHermano3>edadHermano2 && edadHermano2>edadHermano1)
        {
            reporte = (nombreHermano3 +" es el/la mayor, "+ nombreHermano2 +
            " es el/la del medio " + nombreHermano1 + " es el/la menor.");
        }else if(edadHermano3==edadHermano2 && edadHermano2==edadHermano1){
            reporte = "son trillisos";
        }
        return reporte;
    }
}

