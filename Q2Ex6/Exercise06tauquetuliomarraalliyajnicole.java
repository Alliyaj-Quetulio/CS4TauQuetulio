package exercise07tauquetuliomarraalliyajnicole;

public class Exercise07tauquetuliomarraalliyajnicole {
    
    public static void main(String[] args) {
        
        Trainer t1 = new Trainer("Nicole");
        FireType m1 = new FireType("Gary", 100, 50);
        NPC n1 = new NPC("Ella");
        Location l1 = new Location("PISAY", "Reqs");
        
        t1.inspect(m1);
        t1.inspect(n1);
        t1.inspect(l1);
    }   
}
