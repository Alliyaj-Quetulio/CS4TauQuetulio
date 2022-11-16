package exercise06tauquetuliomarraalliyajnicole;

public class GrassType extends Monster {
    
    GrassType(String n, int m, int b) {
        super(n, "grass", "water", "fire", m, b);
    }
    
    @Override
    public void special() {
        hp += (maxHP*0.20);
        System.out.printf("%s did a pose, increasing it to %sHP. %n", name, getHP());
    }
}
