package BE.VDAB;

import BE.VDAB.Animals;

public abstract class Protozoa extends Animals {
    private boolean isParastic;

    public boolean isParastic() {
        return isParastic;
    }

    public void setParastic(boolean parastic) {
        isParastic = parastic;
    }
}
