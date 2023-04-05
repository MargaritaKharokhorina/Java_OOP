package seminar;

import units.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseHero> heroes = new ArrayList<>();
        heroes.add(new Sniper("Vero"));
        heroes.add(new Crossbowman("Ron"));
        heroes.add(new Mage("Aver"));
        heroes.add(new Monk("Atmir"));
        heroes.add(new Spearman("Voland"));
        heroes.add(new Thief("Roman"));
        heroes.add(new Peasant("Ashet"));

        heroes.forEach(n -> System.out.println(n));


    }
}