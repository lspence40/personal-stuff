package net.raid;

import java.util.List;

public class House extends Building {

    private int sleepHealthGain = 10;

    public House(String name, List<Person> occupants) {
        super(name, occupants);
    }

    public void sleep() {
        for (Person p : occupants) {
            p.health += sleepHealthGain;
            if (p.health > 100) {
                p.health = 100;
            }
        }
    }

    @Override
    public void update() {
        sleep();
    }
}
