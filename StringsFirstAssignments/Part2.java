package stringsfirstassignments;
public class Part2 {
    public String findSimpleGene(String dna, int startCondon, int stopCondon){
        System.out.println(dna);
        if(startCondon == -1 || stopCondon == -1){
            return "";
        }
        if(dna.length()%3 == 0){
            return dna.substring(startCondon, stopCondon+3);
        }else {
            return "";
        }
    }
    public void testSimpleGene() {
        String dna = "TAA";
        int startCondon = -1;
        int stopCondon = -1;
        if(dna.contains("ATG")){
            startCondon = dna.indexOf("ATG");
        } else if(dna.contains("atg")){
            startCondon = dna.indexOf("atg");
        }
        if(dna.contains("TAA")){
            stopCondon = dna.indexOf("TAA");
        } else if(dna.contains("taa")){
            stopCondon = dna.indexOf("taa");
        }
        System.out.println("Gene: " + findSimpleGene(dna, startCondon, stopCondon));
        dna = "ATG";
        startCondon = -1;
        stopCondon = -1;
        if(dna.contains("ATG")){
            startCondon = dna.indexOf("ATG");
        } else if(dna.contains("atg")){
            startCondon = dna.indexOf("atg");
        }
        if(dna.contains("TAA")){
            stopCondon = dna.indexOf("TAA");
        } else if(dna.contains("taa")){
            stopCondon = dna.indexOf("taa");
        }
        System.out.println("Gene: " + findSimpleGene(dna,startCondon, stopCondon));
        dna = "AAA";
        startCondon = -1;
        stopCondon = -1;
        if(dna.contains("ATG")){
            startCondon = dna.indexOf("ATG");
        } else if(dna.contains("atg")){
            startCondon = dna.indexOf("atg");
        }
        if(dna.contains("TAA")){
            stopCondon = dna.indexOf("TAA");
        } else if(dna.contains("taa")){
            stopCondon = dna.indexOf("taa");
        }
        System.out.println("Gene: " + findSimpleGene(dna,startCondon, stopCondon));
        dna = "ATGAAATAA";
        startCondon = -1;
        stopCondon = -1;
        if(dna.contains("ATG")){
            startCondon = dna.indexOf("ATG");
        } else if(dna.contains("atg")){
            startCondon = dna.indexOf("atg");
        }
        if(dna.contains("TAA")){
            stopCondon = dna.indexOf("TAA");
        } else if(dna.contains("taa")){
            stopCondon = dna.indexOf("taa");
        }
        System.out.println("Gene: " + findSimpleGene(dna,startCondon, stopCondon));
        dna = "ATGAATAA";
        startCondon = -1;
        stopCondon = -1;
        if(dna.contains("ATG")){
            startCondon = dna.indexOf("ATG");
        } else if(dna.contains("atg")){
            startCondon = dna.indexOf("atg");
        }
        if(dna.contains("TAA")){
            stopCondon = dna.indexOf("TAA");
        } else if(dna.contains("taa")){
            stopCondon = dna.indexOf("taa");
        }
        System.out.println("Gene: " + findSimpleGene(dna,startCondon, stopCondon));
    }
}
