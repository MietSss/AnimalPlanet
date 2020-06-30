package be.vdab.mammal;

import be.vdab.Mammals;

public class Cow extends Mammals {

    private boolean hasHorns;

    public boolean isHasHorns() {
        return hasHorns;
    }

    public void setHasHorns(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }

    public Cow(String name, double weight, String sex, boolean canSwim, int numberOfLegs, boolean hasHorns) {
        super(name, weight, sex, canSwim, numberOfLegs);
        this.hasHorns = hasHorns;
    }

}


