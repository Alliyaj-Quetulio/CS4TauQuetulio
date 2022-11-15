package exercise06tauquetuliomarraalliyajnicole;

public class GrassType extends Monster {
    
    GrassType(String n, int m, int b) {
        super(n, "grass", "water", "fire", m, b);
    }
    
    @Override
    public void special() {
        hp += (maxHP*0.20);
    }
}
