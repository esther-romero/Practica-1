
/**
 * Write a description of class Factorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factorial{
    public int fact(int n){
        int factorial = 1;
        for(int i = 1; i<=n;i++){
            factorial = factorial *i;
        }
        return factorial;
    }
}
