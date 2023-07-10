import edu.duke.*;
/**
 * Escreva a descrição da classe Part2 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Part2 {
    public int howMany(String stringa, String stringb){
        int index = 0;
        int vezes = 0;
        if(stringb.contains(stringa)){
            while(true){                
                index = stringb.indexOf(stringa, index);
                index += stringa.length();
                vezes++;
                if(!stringb.substring(index).contains(stringa)){
                    break;
                }
            }
        }
        System.out.println(vezes);
        return vezes;
    }
}
