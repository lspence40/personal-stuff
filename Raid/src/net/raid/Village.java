package net.raid;

import java.util.ArrayList;
import java.util.List;

public class Village {
    List<Person> roster;
    List<Building> map;

    int food;

    public Village(List<Building> map) {
        this.roster = new ArrayList<>();
        this.map = map;
        this.food = 100;
    }

    public void arrive(Person Person) {
        roster.add(Person);
    }

    public void print() {
        for(Person person : roster) {
            person.print();
        }
    }

    public void getsRaided(int attackStrength) {

        for(int i = 0; i < attackStrength; i++) {
            int target = getTarget();

            if (roster.get(target).hasSword) {
                target = getTarget();
            }

            roster.get(target).stab();
        }
        System.out.println();
    }

    private int getTarget() {
        return (int) (Math.random() * roster.size());
    }

    public void update() {
        for (Building b : map) {
            b.update();
        }
    }

}
