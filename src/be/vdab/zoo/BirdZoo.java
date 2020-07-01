package be.vdab.zoo;

import be.vdab.Animals;
import be.vdab.Birds;
import be.vdab.bird.Cockatiel;
import be.vdab.bird.Eagle;
import be.vdab.bird.Owl;

public class BirdZoo extends Zoo {
    Cockatiel[] cockatiels;
    Eagle[] eagles;
    Owl[] owls;

    public BirdZoo() {
        cockatiels = new Cockatiel[0];
        eagles = new Eagle[0];
        owls = new Owl[0];
    }

    public Cockatiel[] getCockatiels() {
        return cockatiels;
    }

    public void setCockatiels(Cockatiel[] cockatiels) {
        this.cockatiels = cockatiels;
    }

    public Eagle[] getEagles() {
        return eagles;
    }

    public void setEagles(Eagle[] eagles) {
        this.eagles = eagles;
    }

    public Owl[] getOwls() {
        return owls;
    }

    public void setOwls(Owl[] owls) {
        this.owls = owls;
    }


    @Override
    public void addAnimal(Animals animal) {
        if (!(animal instanceof Birds)) {
            System.out.println("This is not a bird");


        } else if (animal instanceof Cockatiel) {

            Cockatiel[] result = new Cockatiel[cockatiels.length + 1];
            for (int i = 0; i < cockatiels.length; i++) {
                result[i] = cockatiels[i];
            }
            result[result.length - 1] = (Cockatiel) animal;
            cockatiels = result;
        } else if (animal instanceof Owl) {

            Owl[] result = new Owl[owls.length + 1];

            for (int i = 0; i < owls.length; i++) {
                result[i] = owls[i];
            }
            result[result.length - 1] = (Owl) animal;
            owls = result;

        } else if (animal instanceof Eagle) {

            Eagle[] result = new Eagle[eagles.length + 1];
            for (int i = 0; i < eagles.length; i++) {
                result[i] = eagles[i];
            }
            result[result.length - 1] = (Eagle) animal;
            eagles = result;
        }

    }

    public void showAnimal() {
        System.out.println("These animals live in Birdiana Zoo :");
        System.out.println();

        if (owls.length > 0) {
            for (Owl owl : owls) {
                System.out.printf("%s is a %s %s and weighs %.2fkg %n%n", owl.getName(), owl.getSex().toUpperCase(), owl.getClass().getSimpleName().toLowerCase(), owl.getWeight());
            }
        }
            else {
                System.out.println("There are no owls in the zoo");
                System.out.println();
            }
        if (cockatiels.length > 0) {
            for (Cockatiel cockatiel : cockatiels) {
                System.out.printf("%s is a %s %s and weighs %.2fkg %n%n", cockatiel.getName(), cockatiel.getSex().toUpperCase(), cockatiel.getClass().getSimpleName().toLowerCase(), cockatiel.getWeight());
            }
        }
            else{
                System.out.println("There are no cockatiels in the zoo");
                System.out.println();
            }
        if (eagles.length > 0) {
            for (Eagle eagle : eagles) {
                System.out.printf("%s is a %s %s and weighs %.2fkg %n%n", eagle.getName(), eagle.getSex().toUpperCase(), eagle.getClass().getSimpleName().toLowerCase(), eagle.getWeight());
            }
        }
        else {
            System.out.println("There are no eagles in the zoo");
            System.out.println();
        }

        }


    }


