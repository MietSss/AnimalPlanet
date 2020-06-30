package be.vdab;

import be.vdab.bird.Cockatiel;
import be.vdab.zoo.BirdZoo;

import java.util.Arrays;

public class ZooApp {
    public static void main(String[] args) {
        BirdZoo paradisio = new BirdZoo();
        Cockatiel fatou = new Cockatiel();
        fatou.setName("Fatou");
        paradisio.addAnimal(fatou);
        for (Cockatiel element : paradisio.getCockatiels()
             ) {
            System.out.println(element.getName());
        }

    }
}
