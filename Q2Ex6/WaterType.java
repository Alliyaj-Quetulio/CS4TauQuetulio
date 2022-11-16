package exercise06tauquetuliomarraalliyajnicole;

public class WaterType extends Monster {
    
    WaterType(String n, int m, int b) {
        super(n, "water", "fire", "grass", m, b);
        atk = (b*70)/100;
        def = (b*130)/100;
    }
    
    @Override
    public void special() {
        def += 2;
        hp -= (maxHP*0.10);
        System.out.printf("%s did a pose, increasing it to %s DEF and reducing it to %sHP. %n", name, getDef(), getHP());
    }
}
