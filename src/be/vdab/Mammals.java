package be.vdab;

public abstract class Mammals extends Animals implements Breathable {

    private boolean canSwim;
    private int numberOfLegs;

    public Mammals(String name, double weight, String sex, boolean canSwim, int numberOfLegs) {
        super(name, weight, sex);
        this.canSwim = canSwim;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void breath() {
        System.out.println("mamal breaths");

    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }


}
