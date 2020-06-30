package be.vdab;

public abstract class Birds extends Animals implements Breathable{

    private String featherColour;
    private Boolean canFly;

    @Override
    public void breath() {
        System.out.println("birdy breaths");
    }

    public String getFeatherColour() {
        return featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }

    public Boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(Boolean canFly) {
        this.canFly = canFly;
    }
}
