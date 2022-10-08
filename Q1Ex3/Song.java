package ex03tauquetulio;
// @author TAU - Quetulio

public class Song {
    String songName, genre;
    int ranking, timesPlayed;
    
    public Song(String songName){
        String[] songGenre = {"Pop", "Country", "Rock", "Hip-hop", "Jazz", "K-Pop", "EDM", "Jazz"};
        int random1 = (int)Math.floor(Math.random()*(8)+0);
        int random2 = (int)Math.floor(Math.random()*(50)+1);
        
        this.songName = songName;
        this.genre = songGenre[random1];
        this.ranking = random2;
        this.timesPlayed = 0;
    }
    
    public void display() {
        System.out.printf("[%s] %nGenre: %s %nRanking in music charts: %s %nTimes played/streamed: %s %n %n", songName, genre, ranking, timesPlayed);
    }
    
    public void streamSong(Audience x) {
        timesPlayed += 1;
        x.streams += 1;
        System.out.printf("%s streamed %s. %n", x.name, songName);
        System.out.printf("%s has streamed a song %s time(s). %n", x.name, x.streams);
    }
    
}
