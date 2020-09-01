
public class Alhandal
{
 public String menor(){
     String monedas = "";
     
     int tiene       = 28; //68gr
     int mMenor      = 1;  //6gr
     int mIntermedio = 5;  //8 gr
     int mMayor      = 10; //10gr
     
     //posibilidad1:  8 de 1 = 48gr, 8bs y 2 de 10 = 20gr,20bs 
     monedas = "Forman 28Bs, ocho monedas de " + mMenor + " bs y dos monedas de "+mMayor+" bs.";         
     
     return monedas;
 }
}
