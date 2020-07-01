package be.vdab.zoo;

import be.vdab.Animals;
import be.vdab.Protozoa;
import be.vdab.protozoa.Amoebe;
import be.vdab.protozoa.Malaria;

public class ProtozoaZoo extends Zoo {
    Amoebe[] amoebes;
    Malaria[] malarias;

    public ProtozoaZoo() {
        amoebes = new Amoebe[0];
        malarias = new Malaria[0];
    }

    @Override
    public void addAnimal(Animals animal) {

        if (!(animal instanceof Protozoa)) {
            System.out.println("This is not a protozoa");


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

    @Override
    public void showAnimal() {
        System.out.println("These animals live in Protozonia Zoo:");
        System.out.println();

        if (amoebes.length > 0) {
            for (Amoebe amoebe : amoebes) {
                System.out.printf("%s is a %s %s and weighs %.2fkg %n%n", amoebe.getName(), amoebe.getSex().toUpperCase(), amoebe.getClass().getSimpleName().toLowerCase(), amoebe.getWeight());
            }
        }
            else {
            System.out.println("There are no amoebes in the zoo ");
            System.out.println();
            }

        if (malarias.length > 0) {
            for (Malaria malaria : malarias) {
                System.out.printf("%s is a %s %s and weighs %.2fkg %n%n", malaria.getName(), malaria.getSex().toUpperCase(), malaria.getClass().getSimpleName().toLowerCase(), malaria.getWeight());
            }
        }
            else {
                System.out.println("There are no malarias in the zoo:");
                System.out.println();
            }
    }


public Amoebe[]getAmoebes(){
        return amoebes;
        }

public void setAmoebes(Amoebe[]amoebes){
        this.amoebes=amoebes;
        }

public Malaria[]getMalarias(){
        return malarias;
        }

public void setMalarias(Malaria[]malarias){
        this.malarias=malarias;
        }
        }


