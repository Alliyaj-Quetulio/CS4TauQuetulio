package ex04tauquetulio;
// @author TAU - Quetulio

public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    private static int totalPerformances;
    
    public Singer(String name, String songName) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings =  0;
        this.favoriteSong = new Song(songName);
    }
    
    public void display() {
        System.out.printf("[%s] %nNo. of performances: %s %nEarnings: %s %nFavorite song: %s %n %n", name, noOfPerformances, earnings, favoriteSong.songName);
    }
    
    public void performForAudience(int crowd){
        noOfPerformances += 1;
        earnings += crowd*100; 
        System.out.printf("%s performed for %s people and earned %s. \n", this.name, crowd, crowd*100);
        totalPerformances += 1;
    }
    public void performForAudience(int crowd, Singer singer){
        noOfPerformances += 1;
        earnings += (crowd*100)/2;
        singer.noOfPerformances += 1;
        singer.earnings += (crowd*100)/2;
         
        System.out.printf("%s and %s performed for %s people and collectively earned %s. \n", this.name, singer.name, crowd, crowd*100);
        totalPerformances += 1;
    }
    
    
    public void changeFavSong(String songName){
        System.out.printf("%s has changed their favorite song from %s to ", name, favoriteSong.songName);
        favoriteSong = new Song(songName);
        System.out.printf("%s. %n", favoriteSong.songName);
    }
    
}
