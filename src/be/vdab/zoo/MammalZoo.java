package be.vdab.zoo;

import be.vdab.Animals;
import be.vdab.Mammals;
import be.vdab.bird.Owl;
import be.vdab.mammal.Cow;
import be.vdab.mammal.Monkey;
import be.vdab.mammal.Tiger;

public class MammalZoo extends Zoo {
    Cow[] cows;
    Monkey[] monkeys;
    Tiger[] tigers;


    public MammalZoo() {
        cows = new Cow[0];
        monkeys = new Monkey[0];
        tigers = new Tiger[0];
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Monkey[] getMonkeys() {
        return monkeys;
    }

    public void setMonkeys(Monkey[] monkeys) {
        this.monkeys = monkeys;
    }

    public Tiger[] getTigers() {
        return tigers;
    }

    public void setTigers(Tiger[] tigers) {
        this.tigers = tigers;
    }

    @Override
    public void addAnimal(Animals animal) {
        if (!(animal instanceof Mammals)) {
            System.out.println("This is not a mammal");


        } else if (animal instanceof Cow) {

            Cow[] result = new Cow[cows.length + 1];
            for (int i = 0; i < cows.length; i++) {
                result[i] = cows[i];
            }
            result[result.length - 1] = (Cow) animal;
            cows = result;
        } else if (animal instanceof Tiger) {

            Tiger[] result = new Tiger[tigers.length + 1];

            for (int i = 0; i < tigers.length; i++) {
                result[i] = tigers[i];
            }
            result[result.length - 1] = (Tiger) animal;
            tigers = result;

        } else if (animal instanceof Monkey) {

            Monkey[] result = new Monkey[monkeys.length + 1];

            for (int i = 0; i < monkeys.length; i++) {
                result[i] = monkeys[i];
            }
            result[result.length - 1] = (Monkey) animal;
            monkeys = result;
        }
    }


    @Override
    public void showAnimal() {
        System.out.println("These animals live in MammaliaZoo :");
        System.out.println();

            for (Tiger tiger : tigers) {
                System.out.printf("%s is a %s %s and weighs %.2fkg %n%n", tiger.getName(), tiger.getSex().toUpperCase(), tiger.getClass().getSimpleName().toLowerCase(), tiger.getWeight());
                if (tigers.length == 0) {
                    System.out.println("There are no tigers in the zoo %n%n");
            }
            for (Monkey monkey : monkeys) {
                System.out.printf("%s is a %s %s and weighs %.2fkg %n%n", monkey.getName(), monkey.getSex().toUpperCase(), monkey.getClass().getSimpleName().toLowerCase(), monkey.getWeight());
                if (monkeys.length == 0) {
                    System.out.println("There are no monkeys in the zo %n%n");
                }
            }
            for (Cow cow : cows) {
                System.out.printf("%s is a %s %s and weighs %.2fkg %n%n", cow.getName(), cow.getSex().toUpperCase(), cow.getClass().getSimpleName().toLowerCase(), cow.getWeight());
                if (cows.length == 0) {
                    System.out.println("There are no cows in the zoo  %n%n");
                }

            }
        }

    }
}