import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Unit hero = new Unit("Jack", 30, 4, 2);
        Unit monster = new Unit("Goblin", 20, 5, 1);

        hero.beginTurn();
        hero.attack(monster);

        monster.beginTurn();
        monster.attack(hero);

    }
}
