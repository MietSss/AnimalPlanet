package be.vdab.mammal;

import be.vdab.Mammals;

public class Cow extends Mammals {

    private boolean hasHorns;

    public Cow(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }

    public boolean isHasHorns() {
        return hasHorns;
    }

    public void setHasHorns(boolean hasHorns) {
        this.hasHorns = hasHorns;
    }
}


