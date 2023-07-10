import edu.duke.*;
public class Part1 {
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int index = dna.indexOf(stopCodon, startIndex);
        if((index)%3 == 0){
            return index;
        }
        return -1;
    }
    public String findGene(String dna){
        if(dna.indexOf("ATG") == -1){
            System.out.println("");
            return "";
        }
        int startIndex = dna.indexOf("ATG");
        int codon1, codon2, codon3;
        codon1 = findStopCodon(dna, startIndex+3, "TAA");
        codon2 = findStopCodon(dna, startIndex+3, "TAG");
        codon3 = findStopCodon(dna, startIndex+3, "TGA");
        if(codon1 == -1){
            codon1 = 999999;
        }
        if(codon2 == -1){
            codon2 = 999999;
        }
        if(codon3 == -1){
            codon3 = 999999;
        }
        if(codon1 == 999999 && codon2 == 999999 && codon3 == 999999){
            System.out.println("");
            return "";
        }
        int minIndex;
        minIndex = Math.min(codon1,Math.min(codon2, codon3));
        String gene = dna.substring(startIndex, minIndex+3);
        System.out.println(gene);
        return gene;
    }
    public void testFindGene (){
        findGene("ATGAATAG");
    }
    public void testFindStopCodon(){
       System.out.println(findStopCodon("123456789", 2, "789"));
    }
}
