import edu.duke.*;
/**
 * Escreva a descrição da classe Part3 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Part3 {
    public int findStopCodon(String dna, int startIndex, String stopCodon){
        int index = dna.indexOf(stopCodon, startIndex);
        if((index-startIndex)%3 == 0){
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
    public int countGenes(String dna){
        int numeroGenes=0;
        int index;
        String gene = "";
        while(true){
            if(!(findGene(dna) != "")){
                break;
            }
            numeroGenes++;
            gene = findGene(dna);
            index = dna.indexOf(gene)+gene.length();
            dna = dna.substring(index);
            
        }
        return numeroGenes;
    }
    public void testCountGenes() {
        System.out.println(countGenes("ATGTAAGATGCCCTAGT"));
    }
}
