package exercise06tauquetuliomarraalliyajnicole;

public class Exercise06tauquetuliomarraalliyajnicole {

    public static void main(String[] args) {
        
        FireType reese = new FireType("Reese", 20, 5);
        GrassType sheena = new GrassType("Sheena", 20, 5);
        WaterType anika = new WaterType("Anika", 20, 5);
        
        boolean fight = true;

        //Monster reese = new Monster("Reese", "fire", "grass", "water", 20, 5);
        //Monster sheena = new Monster("Sheena", "grass", "water", "fire", 20, 5);
        // Monster anika = new Monster("Anika", "water", "fire", "grass", 20, 5);
        
        reese.introduce();
        sheena.introduce();
        anika.introduce();
        
        System.out.println();
        System.out.println("Battle 1: Grass vs. Fire");
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
        
        fight = true;
        System.out.println();
        System.out.println("Battle 1: Fire vs. Water");
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
        
        
    }
    
}
