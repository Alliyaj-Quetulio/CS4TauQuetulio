package exercise06tauquetuliomarraalliyajnicole;
import java.util.ArrayList;

public class Monster {
    protected String name, type, strongAgainst, weakAgainst; // changed to protected and removed final
    protected int maxHP, hp, atk, def, xp, lvl; // changed to protected and double
    private static ArrayList<Monster> monsterList = new ArrayList<>();

    public Monster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);
    }

    public String getName() {
        return name;
    }
    // from int to double
    public double getMaxHP() {
        return maxHP;
    }
    public double getHP() {
        return hp;
    }
    public double getAtk() {
        return atk;
    }
    public double getDef() {
        return def;
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as  double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");

        if(m.hp <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
        }
    }

    public void special(){
        System.out.println(name + " did a pose.");
    }

    public void restoreHealth(){
        hp = maxHP;
    }
    
    public void introduce() {
        System.out.printf("A new %s type named %s has been added. %n", type, name);
    }
}
