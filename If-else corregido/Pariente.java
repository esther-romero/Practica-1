
public class Pariente{
    private int num1, num2;
    
    public Pariente(){
        num1 = 0;
        num2 = 0;
    }
    //verificar con el residuo
    public String verificadorParientes(int num1, int num2){
        String res = "";
        this.num1 = num1;
        this.num2 = num2;
        if(num1 > num2){
            if(num2*1 == num1){
                res = "Son Parientes yeiiiiii!";
            }else if(num2*2 == num1){
                res = "Son Parientes yeiiiiii!";
            }else if(num2*3 == num1){
                res = "Son Parientes yeiiiiii!";
            }else if(num2*4 == num1){
                res = "Son Parientes yeiiiiii!";
            }else if(num2*5 == num1){
                res = "Son Parientes yeiiiiii!";
            }else if(num2*6 == num1){
                res = "Son Parientes yeiiiiii!";
            }else if(num2*7 == num1){
                res = "Son Parientes yeiiiiii!";
            }else if(num2*8 == num1){
                res = "Son Parientes yeiiiiii!";
            }else if(num2*9 == num1){
                res = "Son Parientes yeiiiiii!";
            }else if(num2*10 == num1){
                res = "Son Parientes yeiiiiii!";
            }else{
                res = "No son parientes :(((((((((";
            }
        }else{
             res =num1 + " no es multiplo de " + num2 +", no son parientes :(((((((((";
        }
        return res;
    }
}
