package units;

import seminar.Spells;

import java.util.ArrayList;

public class Mage extends BaseHero {
    protected int mana;

    protected Spells[] spells_book = new Spells[3];

    public Mage(String name, boolean firstTeam) {
        super("Маг", 50, name, firstTeam, 5, new int[]{2, 4}, 8);
        mana = 100;
        spells_book[0] = new Spells("Фаербол");
        spells_book[1] = new Spells("Увеличение брони");
        spells_book[2] = new Spells("Увеличение урона");
    }

    @Override
    public String getInfo() {
        return className + " " + name;
    }

}
