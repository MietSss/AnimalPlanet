package be.vdab.zoo;

import be.vdab.Animals;
import be.vdab.Birds;
import be.vdab.bird.Cockatiel;
import be.vdab.bird.Eagle;
import be.vdab.bird.Owl;
import be.vdab.protozoa.Amoebe;
import be.vdab.protozoa.Malaria;

public class ProtozoaZoo extends Zoo {
    Amoebe[] amoebes;
    Malaria[] malarias;

    @Override
    public void addAnimal(Animals animal) {
        if (!(animal instanceof Malaria)) {
            System.out.println("This is not a protozoa");
            return;


        } else if (animal instanceof Malaria) {

            Malaria[] result = new Malaria[malarias.length + 1];
            for (int i = 0; i < malarias.length; i++) {
                result[i] = malarias[i];
            }
            result[result.length - 1] = (Malaria) animal;
            malarias = result;
        } else if (animal instanceof Amoebe) {

            Amoebe[] result = new Amoebe[amoebes.length + 1];

            for (int i = 0; i < amoebes.length; i++) {
                result[i] = amoebes[i];
            }
            result[result.length - 1] = (Amoebe) animal;
            amoebes = result;

        }
    }

    public Amoebe[] getAmoebes() {
        return amoebes;
    }

    public void setAmoebes(Amoebe[] amoebes) {
        this.amoebes = amoebes;
    }

    public Malaria[] getMalarias() {
        return malarias;
    }

    public void setMalarias(Malaria[] malarias) {
        this.malarias = malarias;
    }
}

