package net.raid;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Person jeff = new Person("jeff", true, false);
        Person bob = new Person("bob", false, true);

        List<Building> map = new ArrayList<>();
        List<Person> occupantsOfBobsHouse = new ArrayList<>();
        occupantsOfBobsHouse.add(bob);
        House h = new House("Bobs House", occupantsOfBobsHouse);
        map.add(h);


        Village theShire = new Village(map);

        theShire.arrive(jeff);
        theShire.arrive(bob);

        theShire.getsRaided(10);

        theShire.print();

        theShire.update();

        theShire.print();

    }
}
