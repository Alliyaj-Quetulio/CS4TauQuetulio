package exercise06tauquetuliomarraalliyajnicole;

public class FireType extends Monster {
    
    FireType(String n, int m, int b) {
        super(n, "fire", "grass", "water", m, b);
        atk = (b*130)/100;
        def = (b*70)/100;
    }
    
    @Override
    public void special() {
        atk += 2;
        hp -= (maxHP*0.10);
        System.out.printf("%s did a pose, increasing it to %s ATK and reducing it to %sHP. %n", name, getAtk(), getHP());
    }
}
