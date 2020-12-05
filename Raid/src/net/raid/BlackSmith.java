package net.raid;

import java.util.List;

public class BlackSmith extends Building {

    private int shieldCount = 0;

    public BlackSmith(String name, List<Person> occupants) {
        super(name, occupants);
    }

    public void giveShield(Person p) {
        p.hasShield = true;
    }

    private void makeShield() {
        shieldCount++;
    }

    @Override
    public void update() {
        makeShield();
    }
}
