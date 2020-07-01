package be.vdab;

import be.vdab.bird.Cockatiel;
import be.vdab.bird.Owl;
import be.vdab.mammal.Dog;
import be.vdab.mammal.Monkey;
import be.vdab.mammal.Tiger;
import be.vdab.protozoa.Amoebe;
import be.vdab.protozoa.Malaria;
import be.vdab.zoo.BirdZoo;
import be.vdab.zoo.MammalZoo;
import be.vdab.zoo.ProtozoaZoo;

import java.util.Scanner;

public class ZooApp {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //6 animals/lifeforms

        Monkey mo = new Monkey("Mo",16 , "Female", true, 4);
        Cockatiel cody = new Cockatiel("Cody", 0.4, "Male", "yellow", true);
        Owl odilon = new Owl("Odilon", 1.4,"Male", "White", true);
        Malaria malus = new Malaria("Malus", 0.005, "X", true);
        Tiger tiny = new Tiger ("Tiny", 56, "Female", true, 4);
        Amoebe phoebe = new Amoebe("phoebe", 0.007, "x", false);

        // extra characteristics

        mo.setAge(6);
        cody.setDiet(Animals.Diet.HERBIVORE);
        odilon.setCanFly(false);                         //Odilon broke his wings
        malus.setDiet(Animals.Diet.OMNIVORE);
        tiny.setWeight(66);                                 // Tiny is getting fat
        phoebe.setAge(2);

        // 3 Zoo's

        MammalZoo mammalia = new MammalZoo();
        BirdZoo birdiana = new BirdZoo();
        ProtozoaZoo protozonia = new ProtozoaZoo();

        //getting the animals in the zoo
        mammalia.addAnimal(mo);
        mammalia.addAnimal(tiny);
        birdiana.addAnimal(odilon);
        birdiana.addAnimal(cody);
        protozonia.addAnimal(phoebe);
        protozonia.addAnimal(malus);


        // list of all the animals in the zoo

        mammalia.showAnimal();
        birdiana.showAnimal();
        protozonia.showAnimal();


        // A dog enters
        Dog max = new Dog();
        System.out.println("Give max a command");
        System.out.println("He knows SPEAK, BEG and LOOK,THE POSTMAN");
        String command = keyboard.nextLine();
        max.react(command.toUpperCase());


        }

    }

