package ex04tauquetulio;
// @author TAU - Quetulio

public class Ex04TauQuetulio {

    public static void main(String[] args) {
        
        // three instances of the Audience class
        Audience reese = new Audience("Reese");
        Audience anika = new Audience("Anika");
        Audience quenso = new Audience("Quenso");
        
        // two instances of the Song class
        Song song1 = new Song("All Too Well");
        Song song2 = new Song("Like or Like Like");
       
        // one instace of the Singer class
        Singer mxmtoon = new Singer("mxmtoon", "Frown");
        Singer taylor = new Singer("Taylor", "I Think He Knows");
        
        // displays the details for each instance of every class
        System.out.println("!!! CONCERT DETAILS !!! \n");
        
        System.out.println("(1) AUDIENCE MEMBER(S):");
        reese.display();
        anika.display();
        quenso.display();
        
        System.out.println("(2) SONG(S):");
        song1.display();
        song2.display();
        
        System.out.println("(3) SINGER(S):");
        mxmtoon.display();
        
        // displays the results of executed methods
        System.out.println("!!! CONCERT EVENTS !!! \n");

        mxmtoon.performForAudience(12);
        mxmtoon.changeFavSong("Unspoken Words");
        
        mxmtoon.performForAudience(20, taylor);
         
        song1.streamSong(reese);
        song2.streamSong(anika);
    }
    
}
