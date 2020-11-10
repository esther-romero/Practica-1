
public class Ejercicio2
{
    public String autocorrector(String name){
        name = name.toLowerCase();
        return autocorrector(name, name.length()-1, "");
    }
    
    private String autocorrector(String name, int pos, String cad2){
        String res = "";
        if(pos == 0){
            char actual = convertir(name.charAt(pos));
            res = actual + cad2;
        }else{
            char posterior = name.charAt(pos-1);
            char actual = name.charAt(pos);
            if(posterior == ' '){
                actual = convertir(actual);
                res = autocorrector(name, pos-1, actual+cad2);
            }else{
                res = autocorrector(name, pos-1, actual+cad2);
            }
        }
        return res;
    }
    
    private char convertir(char letra){
        if(letra == 'a'){
            letra = 'A';
        }else if(letra == 'b'){
            letra = 'B';
        }else if(letra == 'c'){
            letra = 'C';
        }else if(letra == 'd'){
            letra = 'D';
        }else if(letra == 'e'){
            letra = 'E';
        }else if(letra == 'f'){
            letra = 'F';
        }else if(letra == 'g'){
            letra = 'G';
        }else if(letra == 'h'){
            letra = 'H';
        }else if(letra == 'i'){
            letra = 'I';
        }else if(letra == 'j'){
            letra = 'J';
        }else if(letra == 'k'){
            letra = 'K';
        }else if(letra == 'm'){
            letra = 'M';
        }else if(letra == 'n'){
            letra = 'N';
        }else if(letra == 'o'){
            letra = 'O';
        }else if(letra == 'p'){
            letra = 'P';
        }else if(letra == 'q'){
            letra = 'Q';
        }else if(letra == 'r'){
            letra = 'R';
        }else if(letra == 's'){
            letra = 'S';
        }else if(letra == 't'){
            letra = 'T';
        }else if(letra == 'u'){
            letra = 'U';
        }else if(letra == 'v'){
            letra = 'V';
        }else if(letra == 'w'){
            letra = 'W';
        }else if(letra == 'x'){
            letra = 'X';
        }else if(letra == 'y'){
            letra = 'Y';
        }else if(letra == 'z'){
            letra = 'Z';
        }
        
        return letra;
    }
}
