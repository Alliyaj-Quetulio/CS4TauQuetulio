package ex03tauquetulio;
// @author TAU - Quetulio

public class Audience {
    String name, ticket;
    int fanYrs, enjoyment, streams;
    Song favSong;
    
    
    public Audience(String name){
        String[] tOptions = {"Regular", "VIP"};
        int random1 = (int)Math.floor(Math.random()*(2)+0);
        int random2 = (int)Math.floor(Math.random()*(10)+1);
        
        this.name = name;
        this.ticket = tOptions[random1];
        this.fanYrs = random2;
        this.streams = 0;
    }
    
    public void display() {
        System.out.printf("[%s] %nTicket: %s %nYears as a fan: %s %nNumber of streams done: %s %n %n", name, ticket, fanYrs, streams);
    }
}

