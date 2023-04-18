package units;

import java.util.Objects;

public class Rogue extends Infantry {
    public Rogue(String name, boolean firstTeam) {
        super("Разбойник", 50, name, firstTeam, 30, new int[]{9, 29}, 11);
    }

    @Override
    public String getInfo() {
        return className + " " + name;
    }
}
