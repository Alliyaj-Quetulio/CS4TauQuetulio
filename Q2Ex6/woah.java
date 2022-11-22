package exercise06tauquetuliomarraalliyajnicole;

abstract class Character {
    private String name;
    private Location currentLocation;

    public Character(String n){
        this.name = n;
        this.currentLocation = null;
    }
    public Character(String n, Location l){
        this.name = n;
        this.currentLocation = l;
    }

    public String getName(){
        return name;
    }
    public Location getCurrentLocation(){
        return currentLocation;
    }
    public void travel(Location destination){
        currentLocation.removePerson(this);
        destination.addPerson(this);
        currentLocation = destination;
        System.out.println(this.getName() + " travelled to " + destination.getName() + ".");
    }
}

// AAAAAAAAAAAAAAAAAAAA

package exercise06tauquetuliomarraalliyajnicole;
import java.util.*;

public class Trainer extends Character {
    private Monster activeMonster;
    private ArrayList<Monster> team;

    public Trainer(String n){
        super(n);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }
    public Trainer(String n, Location l){
        super(n, l);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
}

// AAAAAAAAAAAAAAAAAAAA

package exercise06tauquetuliomarraalliyajnicole;

public class NPC extends Character {
    private String dialog;

    public NPC(String n){
        super(n);
        this.dialog = "Hello, my name is " + n + ".";
    }
    public NPC(String n, Location l){
        super(n, l);
        this.dialog = "Hello, my name is " + n + ".";
    }
    public NPC(String n, String d){
        super(n);
        this.dialog = d;
    }
    public NPC(String n, Location l, String d){
        super(n, l);
        this.dialog = d;
    }
}

// AAAAAAAAAAAAAAAAAAAA

package exercise06tauquetuliomarraalliyajnicole;
import java.util.*;

public class Location {
    private String name;
    private ArrayList<Character> personList;
    private String localSpecialty;

    public Location(String n){
        this.name = n;
        this.localSpecialty = null;
        this.personList = new ArrayList<>();
    }
    public Location(String n, String s){
        this.name = n;
        this.localSpecialty = s;
        this.personList = new ArrayList<>();
    }

    public String getName(){
        return name;
    }
    public ArrayList<Character> getPersonList(){
        return personList;
    }
    public void addPerson(Character c){
        personList.add(c);
    }
    public void removePerson(Character c){
        personList.remove(c);
    }
}

