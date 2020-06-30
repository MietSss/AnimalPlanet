package be.vdab;

import be.vdab.bird.Cockatiel;
import be.vdab.bird.Owl;
import be.vdab.mammal.Monkey;
import be.vdab.mammal.Tiger;
import be.vdab.protozoa.Malaria;
import be.vdab.zoo.BirdZoo;

import java.util.Arrays;

public class ZooApp {


    public static void main(String[] args) {
        Monkey mo = new Monkey("Mo",16 , "Female", true, 4);
        Cockatiel cody = new Cockatiel("Cody", 0.4, "Male", "yellow", true);
        Owl odilon = new Owl("Odilon", 1.4,"Male", "White", true);
        Malaria malus = new Malaria("Malus", 0.005, "X", true);
        Tiger tiny = new Tiger ("Tiny", 56, "Female", true, 4);

        System.out.println(mo.toString());
        System.out.println(cody.toString());
        System.out.println(odilon.toString());
        System.out.println(malus.toString());
        System.out.println(tiny.toString());










       /*BirdZoo paradisio = new BirdZoo();
        Cockatiel fatou = new Cockatiel();
       fatou.setName("Fatou");
        paradisio.addAnimal(fatou);
        for (Cockatiel element : paradisio.getCockatiels()
             ) {
            System.out.println(element.getName());

        */
        }

    }

