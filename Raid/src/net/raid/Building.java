package net.raid;

import java.util.List;

public class Building {
    public String name;
    public List<Person> occupants;

    public Building(String name, List<Person> occupants) {
        this.name = name;
        this.occupants = occupants;
    }

    public void update() {

    }
}
