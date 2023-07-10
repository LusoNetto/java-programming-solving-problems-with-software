import edu.duke.*;
import java.io.File;
public class Part4 {
    public void processWebPage(){    
        URLResource webPage = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html"); 
        for ( String word : webPage.words() ) {
            String wLow = word.toLowerCase();            
            if ( wLow.contains( "youtube.com" ) ){
                int startQuote = wLow.indexOf("\"");
                int endQuote = wLow.lastIndexOf("\"");
                String ytLink = word.substring( startQuote+1, endQuote );
                System.out.println( ytLink );
            }    
        }        
    }
}