package stringsfirstassignments;
public class Part1 {
    public String findSimpleGene(String dna){
        System.out.println("DNA: " + dna);
        int indexStart;
        int indexEnd;
        if(dna.contains("ATG")){
            indexStart = dna.indexOf("ATG");
        } else {
            return "";
        }
        if(dna.indexOf("TAA", indexStart+3) != -1){
            indexEnd = dna.indexOf("TAA");
        } else {
            return "";
        }
        if(dna.length()%3 == 0){
            return dna.substring(indexStart, indexEnd+3);
        }else {
            return "";
        }
    }
    public void testSimpleGene() {
        String dna1 = "TAA";
        System.out.println("Gene: " + findSimpleGene(dna1));
        String dna2 = "ATG";
        System.out.println("Gene: " + findSimpleGene(dna2));
        String dna3 = "AAA";
        System.out.println("Gene: " + findSimpleGene(dna3));
        String dna4 = "ATGAAATAA";
        System.out.println("Gene: " + findSimpleGene(dna4));
        String dna5 = "ATGAATAA";
        System.out.println("Gene: " + findSimpleGene(dna5));
    }
}
