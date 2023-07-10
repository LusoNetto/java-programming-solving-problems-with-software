package stringsfirstassignments;
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb){
        int index = 0;
        if(stringb.contains(stringa)){
            index = stringb.indexOf(stringa);
            if(stringb.indexOf(stringa, index+1) != -1){
                return true;
            }
        }
        return false;
    }
    public String lastPart(String stringa, String stringb){
        int index;
        System.out.println(stringa);
        System.out.println(stringb);
        index = stringb.indexOf(stringa);
        while(stringb.indexOf(stringa, index+1) != -1){
            index = stringb.indexOf(stringa, index+1);
        }
        if(index != -1){
            return "The part of the string after " + stringa + " in " + stringb + " is " + stringb.substring(index, stringb.length());
        }
        return "The part of the string after " + stringa + " in " + stringb + " is " + stringb;
    }
    public void testing(){
        String stringa="aa", stringb="aaa";
        System.out.println(stringa);
        System.out.println(stringb);
        System.out.println(twoOccurrences(stringa, stringb));
        stringa="an";
        stringb="banana";
        System.out.println( lastPart(stringa, stringb));
        stringa="zoo";
        stringb="forest";
        System.out.println( lastPart(stringa, stringb));
    }
}