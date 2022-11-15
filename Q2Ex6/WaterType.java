package exercise06tauquetuliomarraalliyajnicole;

public class WaterType extends Monster {
    
    WaterType(String n, int m, int b) {
        super(n, "water", "fire", "grass", m, b);
        atk = b*(int)0.7;
        def = b*(int)1.3;
    }
    
    @Override
    public void special() {
        def += 2;
        hp -= (maxHP*0.10);
    }
}
