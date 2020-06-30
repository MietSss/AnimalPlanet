package be.vdab.zoo;

import be.vdab.Animals;
import be.vdab.Birds;
import be.vdab.Mammals;
import be.vdab.bird.Cockatiel;
import be.vdab.bird.Eagle;
import be.vdab.bird.Owl;
import be.vdab.mammal.Cow;
import be.vdab.mammal.Monkey;
import be.vdab.mammal.Tiger;

public class MammalZoo extends Zoo{
    Cow[] cows;
    Monkey[] monkeys;
    Tiger[] tigers;

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
            return;


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
}
