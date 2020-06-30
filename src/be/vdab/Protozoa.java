package be.vdab;

public abstract class Protozoa extends Animals {
    private boolean isParastic;

    public boolean isParastic() {
        return isParastic;
    }

    public void setParastic(boolean parastic) {
        isParastic = parastic;
    }

    public Protozoa(String name, double weight, String sex, boolean isParastic) {
        super(name, weight, sex);
        this.isParastic = isParastic;
    }
}
