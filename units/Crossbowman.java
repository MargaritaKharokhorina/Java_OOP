package units;

public class Crossbowman extends Shooter {

    int arrows;

    int accuracy;

    public Crossbowman(String name, boolean firstTeam) {
        super(100, name, firstTeam, 75, new int[]{8, 14},  10, 80);
    }

    @Override
    public String getInfo() {
        return className + " " + name;
    }
}
