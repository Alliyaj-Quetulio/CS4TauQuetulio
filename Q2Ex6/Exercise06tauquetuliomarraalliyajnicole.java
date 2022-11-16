package exercise06tauquetuliomarraalliyajnicole;

public class Exercise06tauquetuliomarraalliyajnicole {

    public static void main(String[] args) {
        
        FireType reese = new FireType("Reese", 50, 40);
        GrassType sheena = new GrassType("Sheena", 50, 40);
        WaterType anika = new WaterType("Anika", 50, 40);
        
        boolean fight = true;
        
        reese.introduce();
        sheena.introduce();
        anika.introduce();
        
        System.out.println();
        System.out.println("[Battle 1: Grass vs. Fire]");
        while (fight) {
            sheena.attack(reese);
            if (reese.getHP() == 0) {
                fight = false;
                break;
            }
            reese.attack(sheena);
            if (sheena.getHP() == 0) {
                fight = false;
            }
        }
        sheena.restoreHealth();
        reese.restoreHealth();
        
        fight = true;
        System.out.println();
        System.out.println("[Battle 2: Fire vs. Water]");
        while (fight) {
            reese.attack(anika);
            if (anika.getHP() == 0) {
                fight = false;
                break;
            }
            anika.attack(reese);
            if (reese.getHP() == 0) {
                fight = false;
            }
        }
        reese.restoreHealth();
        anika.restoreHealth();
        
        fight = true;
        System.out.println();
        System.out.println("[Battle 3: Water vs. Grass]");
        while (fight) {
            anika.attack(sheena);
            if (sheena.getHP() == 0) {
                fight = false;
                break;
            }
            sheena.attack(anika);
            if (anika.getHP() == 0) {
                fight = false;
            }
        }
        anika.restoreHealth();
        sheena.restoreHealth();      
    }
}
