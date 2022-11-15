package exercise06tauquetuliomarraalliyajnicole;

public class FireType extends Monster {
    
    FireType(String n, int m, int b) {
        super(n, "fire", "grass", "water", m, b);
        atk = b*(int)1.3;
        def = b*(int)0.7;
    }
    
    @Override
    public void special() {
        atk += 2;
        hp -= (maxHP*0.10);
    }
}
